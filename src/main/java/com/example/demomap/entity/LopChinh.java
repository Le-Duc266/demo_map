package com.example.demomap.entity;

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
@Table(name = "lop_chinh")
public class LopChinh extends BaseEntity {
    @Id
    @GeneratedValue(generator = "lop_chinh_id_seq")
    @SequenceGenerator(name = "lop_chinh_id_seq", sequenceName = "lop_chinh_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
}
