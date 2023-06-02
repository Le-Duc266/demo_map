package com.example.demomap.entity.map;

import com.apus.base.entity.BaseEntity;
import com.example.demomap.dto.ColorOutput;
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
@Table(name = "shoe_color_map")
public class ColorMapEntity extends BaseEntity {
    @Id
    @GeneratedValue(generator = "shoe_color_map_id_seq")
    @SequenceGenerator(name = "shoe_color_map_id_seq", sequenceName = "shoe_color_map_id_seq", allocationSize = 50)
    private Long id;
    @Column(name = "shoe_id")
    private Long shoeId;
    @Column(name = "color_id")
    private Long colorId;
}
