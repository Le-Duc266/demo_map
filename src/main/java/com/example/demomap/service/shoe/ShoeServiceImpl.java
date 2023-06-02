package com.example.demomap.service.shoe;

import com.apus.base.exception.CommandExceptionBuilder;
import com.example.demomap.common.constants.ErrorCodes;
import com.example.demomap.dto.*;
import com.example.demomap.entity.ColorEntity;
import com.example.demomap.entity.ShoeEntity;
import com.example.demomap.entity.SizeEntity;
import com.example.demomap.entity.map.ColorMapEntity;
import com.example.demomap.entity.map.SizeMapEntity;
import com.example.demomap.repository.*;
import com.example.demomap.service.color.ColorService;
import com.example.demomap.service.Size.SizeService;
import com.example.demomap.specification.ShoeSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ShoeServiceImpl implements ShoeService {
    private final ShoeMapper mapper;
    private final ShoeRepository repository;
    private final ShoeSpecification specification;
    private final SizeMapRepository sizeMapRepository;
    private final ColorMapRepository colorMapRepository;
    private final ColorRepository colorRepository;
    private final SizeRepository sizeRepository;
    private final ColorService colorService;
    private final SizeService sizeService;

    @Override
    @Transactional
    public ShoeEntity create(ShoeInput input) {
        ShoeEntity entity = mapper.getInputToEntity(input);
        repository.save(entity);
        getShoeMapEntity(input, entity);
        return entity;
    }

    @Override
    @Transactional
    public ShoeEntity update(Long id, ShoeInput input) {
        ShoeEntity entity = detail(id);
        mapper.updateToEntity(entity, input);
        sizeMapRepository.deleteAllByShoeId(id);
        colorMapRepository.deleteAllByShoeId(id);
        getShoeMapEntity(input, entity);
        return entity;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        ShoeEntity entity = detail(id);
        sizeMapRepository.deleteAllByShoeId(id);
        colorMapRepository.deleteAllByShoeId(id);
        repository.delete(entity);
    }

    private void getShoeMapEntity(ShoeInput input, ShoeEntity entity) {
        List<ColorMapEntity> colorList = new ArrayList<>();
        for (Long color : input.getColorIds()) {
            ColorMapEntity colorMap = new ColorMapEntity();
            colorMap.setShoeId(entity.getId());
            colorMap.setColorId(color);
            colorList.add(colorMap);
        }
        colorMapRepository.saveAll(colorList);
        List<SizeMapEntity> sizeList = new ArrayList<>();
        for (Long size : input.getSizeIds()) {
            SizeMapEntity sizeMap = new SizeMapEntity();
            sizeMap.setShoeId(entity.getId());
            sizeMap.setSizeId(size);
            sizeList.add(sizeMap);
        }
        sizeMapRepository.saveAll(sizeList);
    }


    @Override
    public ShoeEntity detail(Long id) {
        return repository.findById(id).orElseThrow(
                () -> CommandExceptionBuilder.exception(ErrorCodes.PRODUCT_CATEGORY_NOT_FOUND, id));
    }

    public List<ColorOutput> getColor(Long id) {
        List<ColorOutput> colorOutput = new ArrayList<>();
        List<ColorMapEntity> colorMapEntities = colorMapRepository.findAllByShoeId(id);
        colorMapEntities.forEach(colorMap -> {
            ColorOutput color = colorService.getOutput(colorService.detail(colorMap.getColorId()));
            color.setId(color.getId());
            color.setCode(color.getCode());
            color.setName(color.getName());
            colorOutput.add(color);
        });
        return colorOutput;
    }

    @Override
    public ShoeOutput getShoeDto(ShoeEntity entity) {
        ShoeOutput output = mapper.getOutputFromEntity(entity);
        List<ColorMapEntity> colorMapEntities = colorMapRepository.findAllByShoeId(entity.getId());
        List<SizeMapEntity> sizeMapEntities = sizeMapRepository.findAllByShoeId(entity.getId());

        List<Long> colorIds = colorMapEntities.stream().map(ColorMapEntity::getColorId).collect(Collectors.toList());
        List<Long> sizeIds = sizeMapEntities.stream().map(SizeMapEntity::getSizeId).collect(Collectors.toList());

        Map<Long, ColorEntity> colorMap = colorRepository.findAllById(colorIds)
                .stream().collect(Collectors.toMap(ColorEntity::getId, Function.identity()));
        Map<Long, SizeEntity> sizeMap = sizeRepository.findAllById(sizeIds)
                .stream().collect(Collectors.toMap(SizeEntity::getId, Function.identity()));

        Set<ColorOutput> colorOutputList = colorMapEntities.stream()
                .map(color -> colorService.getOutput(colorMap.get(color.getColorId())))
                .collect(Collectors.toSet());

        List<SizeOutput> sizeOutputList = sizeMapEntities.stream()
                .map(size -> sizeService.getOutput(sizeMap.get(size.getSizeId())))
                .collect(Collectors.toList());

        output.setColors(colorOutputList);
        output.setSizes(sizeOutputList);
        return output;
    }

    @Override
    public Page<ShoeOutput> getAllShoe(String search, Boolean activated, Pageable pageable) {
        Page<ShoeEntity> pages = repository.findAll(specification.filterUsers(search, activated).or(specification.filterUnAccent(search, activated)), pageable);
        Set<Long> shoeIds = pages.stream().map(ShoeEntity::getId).collect(Collectors.toSet());

        // lấy ra dữ liệu của màu sắc

        Set<Long> colorIds = new HashSet<>();
        Set<ColorMapEntity> colorMap = colorMapRepository.findAllByShoeIdIn(shoeIds);
        Map<Long, Set<Long>> colorSet = new HashMap<>();
        colorMap.forEach(colorEntity -> {
            colorIds.add(colorEntity.getColorId());
            if (colorSet.get(colorEntity.getShoeId()) != null) {
                colorSet.get(colorEntity.getShoeId()).add(colorEntity.getColorId());
            } else {
                Set<Long> color = new HashSet<>();
                color.add(colorEntity.getColorId());
                colorSet.put(colorEntity.getShoeId(), color);
            }
        });
        Map<Long, ColorEntity> colorEntityMap = colorRepository.findAllByIdIn(colorIds).stream().collect(Collectors.toMap(ColorEntity::getId, Function.identity()));
        Map<Long, Set<ColorOutput>> color1 = new HashMap<>();
        colorSet.forEach((along, longs) -> {
            Set<ColorOutput> outputSet = new HashSet<>();
            for (Long long1 : longs) {
                outputSet.add(mapper.mapEntityToOutput(colorEntityMap.get(long1)));
            }
            color1.put(along, outputSet);
        });

        // lấy ra dữ  liệu của kích thước
        // cách 1:
        Set<Long> sizeIds = new HashSet<>();
        List<SizeMapEntity> sizeMap = sizeMapRepository.findAll();
        // Long: id của shoe
        // Set<Long>: tập set id của size
        Map<Long, Set<Long>> sizeSet = new HashMap<>();
        sizeMap.forEach(sizeEntity -> {
            sizeIds.add(sizeEntity.getSizeId());
            if (sizeSet.get(sizeEntity.getShoeId()) != null) {
                sizeSet.get(sizeEntity.getShoeId()).add(sizeEntity.getSizeId());
            } else {
                Set<Long> size = new HashSet<>();
                size.add(sizeEntity.getSizeId());
                sizeSet.put(sizeEntity.getShoeId(), size);
            }
        });

        Map<Long, SizeEntity> sizeEntityMap = sizeRepository.findAllByIdIn(sizeIds).stream().collect(Collectors.toMap(SizeEntity::getId, Function.identity()));
        Map<Long, Set<SizeOutput>> size = new HashMap<>();
        sizeSet.forEach((along, longs) -> {
            Set<SizeOutput> outputSet = new HashSet<>();
            for (Long long1 : longs) {
                outputSet.add(mapper.getSizeOutput(sizeEntityMap.get(long1)));
            }
            size.put(along, outputSet);
        });

        // cách 2:
        Set<SizeMapOutput> sizeMapOutputs = repository.getAllShoeSize();
        Map<Long,List<SizeOutput>> sizeMapOutput = new HashMap<>();
        sizeMapOutputs.forEach(sizeMap1 -> {

            SizeOutput output = new SizeOutput();
            output.setId(sizeMap1.getSizeId());
            output.setCode(sizeMap1.getCodeSize());
            output.setName(sizeMap1.getSizeName());

            if(sizeMapOutput.get(sizeMap1.getShoeId()) != null){
                sizeMapOutput.get(sizeMap1.getShoeId()).add(output);
            }
            else{
                List<SizeOutput> sizeList = new ArrayList<>();
                sizeList.add(output);
                sizeMapOutput.put(sizeMap1.getShoeId(),sizeList);
            }
        });
        return pages.map(shoe -> {
            ShoeOutput output = mapper.getOutputFromEntity(shoe);
            output.setColors(color1.get(shoe.getId()));
            output.setSizes(sizeMapOutput.get(shoe.getId()));
            return output;
        });
    }
}
