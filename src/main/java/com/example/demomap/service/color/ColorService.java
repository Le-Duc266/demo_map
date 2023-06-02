package com.example.demomap.service.color;

import com.example.demomap.dto.ColorOutput;
import com.example.demomap.entity.ColorEntity;

public interface ColorService {
    ColorEntity detail(Long id);
    ColorOutput getOutput(ColorEntity entity);
}
