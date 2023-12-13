package com.example.demomap.dto;

import lombok.Data;

import java.util.List;

@Data
public class LopChinhOutput {
    private Long id;
    private String code;
    private String name;
    private List<Lop2Output> secondClass;
}
