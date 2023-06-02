package com.example.demomap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoeInput {
    private String code;
    private String name;
    private String imageUrl;
    private String description;
    private Boolean activated;
    private List<Long> colorIds;
    private List<Long> sizeIds;

}
