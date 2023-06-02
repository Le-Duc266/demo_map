package com.example.demomap.repository;

import com.apus.base.repository.BaseRepository;
import com.example.demomap.dto.ShoeSizeOutput;
import com.example.demomap.dto.SizeMapOutput;
import com.example.demomap.entity.ShoeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface ShoeRepository extends BaseRepository<ShoeEntity> {
    @Query(" SELECT new com.example.demomap.dto.ShoeSizeOutput(sz.id as idShoe, sz.code as codeShoe ,sz.name as nameShoe," +
            " s.imageUrl as imageUrl,s.description as description, s.activated as activated " +
            "  ,szm.id as idSizeMap,sz.id as idSize, sz.code as codeSize ,sz.name as nameSize) FROM ShoeEntity s " +
            "  JOIN SizeMapEntity szm  ON szm.shoeId = s.id " +
            "  JOIN SizeEntity sz ON szm.sizeId = sz.id ")
    Set<ShoeSizeOutput> getAllSizeByShoeId();

    @Query("select new com.example.demomap.dto.SizeMapOutput(sm.shoeId as shoeId,s.id as sizeId,s.code as codeSize,s.name as sizeName) " +
            "FROM SizeMapEntity sm Join SizeEntity s ON sm.sizeId = s.id")
    Set<SizeMapOutput> getAllShoeSize();


}
