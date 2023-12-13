package com.example.demomap.service.lopchinh;

import com.apus.base.exception.CommandExceptionBuilder;
import com.example.demomap.common.constants.ErrorCodes;
import com.example.demomap.dto.*;
import com.example.demomap.entity.Lop2;
import com.example.demomap.entity.Lop3;
import com.example.demomap.entity.LopChinh;
import com.example.demomap.repository.Lop2Repository;
import com.example.demomap.repository.Lop3Repository;
import com.example.demomap.repository.LopChinhRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional(readOnly = true)
public class LopChinhServiceImpl implements LopChinhService {
    @Autowired
    private LopChinhMapper mapper;
    @Autowired
    private LopChinhRepository repository;
    @Autowired
    private Lop2Repository lop2Repository;
    @Autowired
    private Lop3Repository lop3Repository;

    @Override
    public LopChinhOutput getLopChinh(Long id) {
        LopChinh entity = detail(id);
        List<Lop2> secondList = lop2Repository.findAllByLopChinhId(entity.getId());
        List<Lop2Output> output2List = new ArrayList<>();
        Set<Long> ids = secondList.stream().map(Lop2::getId).collect(Collectors.toSet());
        List<Lop3> thirdList = lop3Repository.findAllByIdIn(ids);
        List<Lop3Output> output3 = thirdList.stream().map(mapper::getOutputThird).collect(Collectors.toList());
        secondList.forEach(second -> {
            Lop2Output output2 = mapper.getOutputSecond(second);
            output2.setThirdClass(output3);
            output2List.add(output2);
        });
        LopChinhOutput output = mapper.getOutput(entity);
        output.setSecondClass(output2List);
        return output;
    }

    @Override
    @Transactional
    public void create(LopChinhInput input) {
        LopChinh entity = mapper.getInput(input);
        repository.saveAndFlush(entity);
        for (Lop2Input lop2Input : input.getSecondClasses()) {
            Lop2 second = mapper.getInputSecond(lop2Input);
            second.setLopChinhId(entity.getId());
            lop2Repository.saveAndFlush(second);
            for (Lop3Input lop3Input : lop2Input.getThirdClass()) {
                Lop3 third = mapper.getInputThird(lop3Input);
                third.setLop2Id(second.getId());
                lop3Repository.saveAndFlush(third);
            }
        }
    }

    public LopChinh detail(Long id) {
        return repository.findById(id).orElseThrow(
                () -> CommandExceptionBuilder.exception(ErrorCodes.PRODUCT_CATEGORY_NOT_FOUND, id));
    }
}
