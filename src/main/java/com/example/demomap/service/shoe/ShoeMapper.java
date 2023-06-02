package com.example.demomap.service.shoe;

import com.example.demomap.dto.ColorOutput;
import com.example.demomap.dto.ShoeInput;
import com.example.demomap.dto.ShoeOutput;
import com.example.demomap.dto.SizeOutput;
import com.example.demomap.entity.ColorEntity;
import com.example.demomap.entity.ShoeEntity;
import com.example.demomap.entity.SizeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ShoeMapper {
    ShoeEntity getInputToEntity(ShoeInput input);
    ShoeOutput getOutputFromEntity(ShoeEntity entity);
    void updateToEntity(@MappingTarget ShoeEntity entity,ShoeInput input);
    ColorOutput mapEntityToOutput(ColorEntity entity);
    SizeOutput getSizeOutput(SizeEntity entity);
}
