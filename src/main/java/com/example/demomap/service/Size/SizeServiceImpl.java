package com.example.demomap.service.Size;

import com.apus.base.exception.CommandExceptionBuilder;
import com.example.demomap.common.constants.ErrorCodes;
import com.example.demomap.dto.SizeOutput;
import com.example.demomap.entity.SizeEntity;
import com.example.demomap.repository.SizeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class SizeServiceImpl implements SizeService{
    private final SizeRepository repository;

    @Override
    public SizeEntity detail(Long id) {
        return repository.findById(id).orElseThrow(
                () -> CommandExceptionBuilder.exception(ErrorCodes.PRODUCT_CATEGORY_NOT_FOUND, id));
    }

    @Override
    public SizeOutput getOutput(SizeEntity entity) {
        SizeOutput output = new SizeOutput();
        output.setId(entity.getId());
        output.setCode(entity.getCode());
        output.setName(entity.getName());
        return output;
    }
}
