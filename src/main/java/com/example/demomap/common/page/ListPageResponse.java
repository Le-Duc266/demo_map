package com.example.demomap.common.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ListPageResponse<T> implements Serializable {

    private List<T> content;

    private Integer number;

    private Integer size;

    private String sort;

    private long totalElements;

    @JsonProperty("totalPages")
    private Integer totalPages;
}
