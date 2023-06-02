package com.example.demomap.specification;

import com.example.demomap.common.constants.Constants;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@AllArgsConstructor
@Component
public abstract class AbstractSpecification<T> {
    public Specification<T> searchContains(String search) {
        return (root, query, builder) -> {
            Predicate predicate = builder.conjunction();
            String searchTerm = "%" + search.toLowerCase().trim() + "%";
            if (StringUtilss.containsNonAccentChars(search)) {
                predicate = getPredicate(root, builder, predicate, searchTerm);
            } else {
                predicate = builder.and(predicate, builder.or(
                        builder.like(builder.lower(root.get("code")), searchTerm),
                        builder.like(builder.lower(root.get("name")), searchTerm)
                ));
            }
            return predicate;
        };
    }

    private Predicate getPredicate(Root<T> root, CriteriaBuilder builder, Predicate predicate, String searchTerm) {
        Expression<String> unaccentedCode = builder.function(Constants.UN_ACCENT, String.class, root.get("code"));
        Expression<String> unaccentedName = builder.function(Constants.UN_ACCENT, String.class, root.get("name"));
        predicate = builder.and(predicate, builder.or(
                builder.like(builder.lower(unaccentedCode), searchTerm),
                builder.like(builder.lower(unaccentedName), searchTerm)
        ));
        return predicate;
    }

    public Specification<T> searchUnAccentContains(String search) {
        return (root, query, builder) -> {
            Predicate predicate = builder.conjunction();
            String unAccentSearch = StringUtilss.replaceToUnAccent(search);
            String searchTerm = "%" + unAccentSearch.toLowerCase().trim() + "%";
            predicate = getPredicate(root, builder, predicate, searchTerm);
            return predicate;
        };
    }

    public Specification<T> getByActive(Boolean activated){
        return (root, query, builder) -> Boolean.TRUE.equals(activated) ? builder.isTrue(root.get("activated"))
                : builder.isFalse(root.get("activated"));
    }
}
