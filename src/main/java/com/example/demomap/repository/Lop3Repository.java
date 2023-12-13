package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.entity.Lop3;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface Lop3Repository extends BaseRepository<Lop3> {
    List<Lop3> findAllByIdIn(Collection<Long> ids);
}
