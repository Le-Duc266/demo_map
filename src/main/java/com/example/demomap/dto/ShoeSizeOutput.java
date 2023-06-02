package com.example.demomap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoeSizeOutput {
    private Long id;
    private String codeShoe;
    private String nameShoe;
    private  String imageUrl;
    private String description;
    private Boolean activated;
    private Long idSizeMap;
    private Long idSize;
    private String codeSize;
    private String nameSize;
}
