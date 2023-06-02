package com.example.demomap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SizeMapOutput {
    private Long shoeId;
    private Long sizeId;
    private String codeSize;
    private String sizeName;

}
