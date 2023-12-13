package com.example.demomap.dto;

import lombok.Data;

import java.util.List;

@Data
public class Lop2Output {
    private Long id;
    private String code;
    private String name;
    private List<Lop3Output> thirdClass;
}
