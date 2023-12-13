package com.example.demomap.controller;

import com.apus.base.response.ResponseWrapper;
import com.example.demomap.dto.LopChinhInput;
import com.example.demomap.dto.LopChinhOutput;
import com.example.demomap.service.lopchinh.LopChinhService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/example")
@RequiredArgsConstructor
@ResponseWrapper
public class LopChinhController {
    private final LopChinhService service;

    @GetMapping
    public LopChinhOutput getLopChinh(@RequestParam Long id){
        return service.getLopChinh(id);
    }

    @PostMapping
    public void create(@RequestBody @Valid LopChinhInput input){
        service.create(input);
    }
}
