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
@Table(name = "shoe")
public class ShoeEntity extends BaseEntity {
    @Id
    @GeneratedValue(generator = "shoe_id_seq")
    @SequenceGenerator(name = "shoe_id_seq", sequenceName = "shoe_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "description")
    private String description;
    @Column(name = "activated")
    private Boolean activated;
}
