package com.example.demomap.entity.map;

import com.apus.base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shoe_size_map")
public class SizeMapEntity extends BaseEntity {
    @Id
    @GeneratedValue(generator = "shoe_size_map_id_seq")
    @SequenceGenerator(name = "shoe_size_map_id_seq", sequenceName = "shoe_size_map_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "shoe_id")
    private Long shoeId;
    @Column(name = "size_id")
    private Long sizeId;

}
