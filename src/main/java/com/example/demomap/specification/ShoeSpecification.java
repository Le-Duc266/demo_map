package com.example.demomap.specification;

import com.example.demomap.entity.ShoeEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class ShoeSpecification extends AbstractSpecification<ShoeEntity>{

    public Specification<ShoeEntity> filterUsers(String search,Boolean activated) {
        Specification<ShoeEntity> spec = Specification.where(null);
        if (!StringUtils.isBlank(search)) {
            spec = spec.and(this.searchContains(search));
        }
        if (activated != null){
            spec = spec.and(this.getByActive(activated));
        }
        return spec;
    }

    public  Specification<ShoeEntity> filterUnAccent(String search,Boolean activated) {
        Specification<ShoeEntity> spec = Specification.where(null);
        if (!StringUtils.isBlank(search)) {
            spec = spec.and(this.searchUnAccentContains(search));
        }
        if (activated != null){
            spec = spec.and(this.getByActive(activated));
        }
        return spec;
    }
}
