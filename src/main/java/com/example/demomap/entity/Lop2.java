package com.example.demomap.entity;

import com.apus.base.aspect.relation.ForeignKey;
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
@Table(name = "lop_2")
public class Lop2 extends BaseEntity {
    @Id
    @GeneratedValue(generator = "lop_2_id_seq")
    @SequenceGenerator(name = "lop_2_id_seq", sequenceName = "lop_2_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "lop_chinh_id")
    @ForeignKey(target = LopChinh.class)
    private Long lopChinhId;
}
