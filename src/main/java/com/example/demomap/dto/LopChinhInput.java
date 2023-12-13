package com.example.demomap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LopChinhInput {
    private String code;
    private String name;
    private List<Lop2Input> secondClasses;
}
