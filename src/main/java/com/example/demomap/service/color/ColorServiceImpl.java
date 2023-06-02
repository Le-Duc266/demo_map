package com.example.demomap.service.color;

import com.apus.base.exception.CommandExceptionBuilder;
import com.example.demomap.common.constants.ErrorCodes;
import com.example.demomap.dto.ColorOutput;
import com.example.demomap.entity.ColorEntity;
import com.example.demomap.repository.ColorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {
    private final ColorRepository repository;
    @Override
    public ColorEntity detail(Long id) {
        return repository.findById(id).orElseThrow(
                () -> CommandExceptionBuilder.exception(ErrorCodes.PRODUCT_CATEGORY_NOT_FOUND, id));
    }

    @Override
    public ColorOutput getOutput(ColorEntity entity) {
        ColorOutput output = new ColorOutput();
        output.setId(entity.getId());
        output.setCode(entity.getCode());
        output.setName(entity.getName());
        return output;
    }

}
