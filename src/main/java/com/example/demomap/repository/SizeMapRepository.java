package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.entity.SizeEntity;
import com.example.demomap.entity.map.SizeMapEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SizeMapRepository extends BaseRepository<SizeMapEntity> {
    List<SizeMapEntity> deleteAllByShoeId(Long id);
    List<SizeMapEntity> findAllByShoeId(Long id);

    Set<SizeMapEntity> findAllByShoeIdIn(Set<Long> ids);

    List<SizeMapEntity> findAll();
}
