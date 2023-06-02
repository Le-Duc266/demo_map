package com.example.demomap.common.converter;

import com.apus.base.converter.GenericJsonConverter;

import java.util.List;

public class ListStringConverter extends GenericJsonConverter<List<String>> {
    protected ListStringConverter() {
        super((Class<List<String>>) (Object) List.class);
    }
}
