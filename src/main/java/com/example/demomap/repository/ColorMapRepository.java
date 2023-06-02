package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.entity.map.ColorMapEntity;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ColorMapRepository extends BaseRepository<ColorMapEntity> {
    List<ColorMapEntity> deleteAllByShoeId(Long id);
    List<ColorMapEntity> findAllByShoeId(Long id);
    Set<ColorMapEntity> findAllByShoeIdIn(@Param("shoeIds") Set<Long> shoeIds);
}
