package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.entity.Lop2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Lop2Repository extends BaseRepository<Lop2> {
    List<Lop2> findAllByLopChinhId(Long id);
}
