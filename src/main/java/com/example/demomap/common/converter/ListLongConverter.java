package com.example.demomap.common.converter;

import com.apus.base.converter.GenericJsonConverter;

import java.util.List;

public class ListLongConverter extends GenericJsonConverter<List<Long>> {
    protected ListLongConverter() {
        super((Class<List<Long>>) (Object) List.class);
    }
}
