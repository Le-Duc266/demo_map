package com.example.demomap.service.lopchinh;

import com.example.demomap.dto.LopChinhInput;
import com.example.demomap.dto.LopChinhOutput;

public interface LopChinhService {
    LopChinhOutput getLopChinh(Long id);

    void create(LopChinhInput input);
}
