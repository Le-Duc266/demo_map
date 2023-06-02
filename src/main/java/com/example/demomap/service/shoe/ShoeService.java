package com.example.demomap.service.shoe;

import com.example.demomap.dto.ColorOutput;
import com.example.demomap.dto.ShoeInput;
import com.example.demomap.dto.ShoeOutput;
import com.example.demomap.entity.ShoeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShoeService {
    ShoeEntity create (ShoeInput input);
    ShoeEntity update (Long id,ShoeInput input);
    void delete(Long id);
    ShoeEntity detail(Long id);
    ShoeOutput getShoeDto(ShoeEntity entity);
    List<ColorOutput> getColor(Long id);
    Page<ShoeOutput> getAllShoe(String search, Boolean activated,Pageable pageable);
}
