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
@Table(name = "lop_3")
public class Lop3 extends BaseEntity {
    @Id
    @GeneratedValue(generator = "lop_3_id_seq")
    @SequenceGenerator(name = "lop_3_id_seq", sequenceName = "lop_3_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "lop_2_id")
    @ForeignKey(target = Lop2.class)
    private Long lop2Id;
}
