package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.entity.SizeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Repository
public interface SizeRepository extends BaseRepository<SizeEntity> {
    List<SizeEntity> findAllByIdIn (Set<Long> ids);

    @Query(value = "select s.id,s.code,s.name,s.description,sz.id as idSize,sz.name as nameSize from ShoeEntity s " +
            "JOIN SizeMapEntity szm ON s.id = szm.shoeId " +
            "JOIN SizeEntity sz ON szm.sizeId = sz.id")
    List<SizeEntity> getAllByShoeId(Collection<Long> ids);
}
