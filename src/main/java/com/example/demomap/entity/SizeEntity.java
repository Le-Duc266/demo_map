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
@Table(name = "size")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SizeEntity extends BaseEntity {
    @Id
    @GeneratedValue(generator = "size_id_seq")
    @SequenceGenerator(name = "size_id_seq", sequenceName = "size_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
}
