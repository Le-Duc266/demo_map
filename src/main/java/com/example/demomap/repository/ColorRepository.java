package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.entity.ColorEntity;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ColorRepository extends BaseRepository<ColorEntity> {
    List<ColorEntity> findAllByIdIn(Collection<Long> ids);
}
