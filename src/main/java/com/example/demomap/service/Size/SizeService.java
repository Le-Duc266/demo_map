package com.example.demomap.service.Size;

import com.example.demomap.dto.SizeOutput;
import com.example.demomap.entity.SizeEntity;

public interface SizeService {
    SizeEntity detail(Long id);
    SizeOutput getOutput(SizeEntity entity);
}
