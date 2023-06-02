package com.example.demomap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoeOutput {
    private Long id;
    private String code;
    private String name;
    private String imageUrl;
    private String description;
    private Boolean activated;
    private Set<ColorOutput> colors;
    private List<SizeOutput> sizes;
}
