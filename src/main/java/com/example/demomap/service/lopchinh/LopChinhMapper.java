package com.example.demomap.service.lopchinh;

import com.example.demomap.dto.*;
import com.example.demomap.entity.Lop2;
import com.example.demomap.entity.Lop3;
import com.example.demomap.entity.LopChinh;
import org.mapstruct.Mapper;

@Mapper
public interface LopChinhMapper {
    LopChinh getInput(LopChinhInput input);

    LopChinhOutput getOutput(LopChinh lopChinh);

    Lop2Output getOutputSecond(Lop2 lopChinh);

    Lop3Output getOutputThird(Lop3 lopChinh);

    Lop2 getInputSecond(Lop2Input input2);

    Lop3 getInputThird(Lop3Input input2);
}
