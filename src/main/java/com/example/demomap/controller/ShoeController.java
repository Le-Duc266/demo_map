package com.example.demomap.controller;

import com.apus.base.paging.HandsomePaging;
import com.apus.base.response.ResponseWrapper;
import com.example.demomap.dto.ColorOutput;
import com.example.demomap.dto.ShoeInput;
import com.example.demomap.dto.ShoeOutput;
import com.example.demomap.entity.ShoeEntity;
import com.example.demomap.service.shoe.ShoeService;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shoe")
@RequiredArgsConstructor
@ResponseWrapper
public class ShoeController {
    private final ShoeService service;

    @PostMapping
    public ShoeOutput create(@RequestBody ShoeInput input) {
        ShoeEntity entity = service.create(input);
        return service.getShoeDto(entity);
    }

    @PutMapping
    public ShoeOutput update(@RequestParam Long id, @RequestBody ShoeInput input) {
        ShoeEntity entity = service.update(id, input);
        return service.getShoeDto(entity);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        service.delete(id);
    }

    @GetMapping()
    public ShoeOutput detail(@RequestParam Long id) {
        ShoeEntity entity = service.detail(id);
        return service.getShoeDto(entity);
    }

    @GetMapping("/list")
    @HandsomePaging
    Page<ShoeOutput> getAll(@RequestParam(name = "search", required = false) String search,
                            @RequestParam(required = false)Boolean activated,
                            @ParameterObject Pageable pageable) {
        return service.getAllShoe(search, activated, pageable);
    }

    @GetMapping("/color")
    List<ColorOutput> getColor(@RequestParam(name = "id") Long id) {
        return service.getColor(id);
    }
}
