package com.learning.predicates.util;

import com.learning.predicates.dto.UserRequest;
import com.learning.predicates.models.User;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;



@Component
public class UserSpecification {

  public Specification<User> getUsers(String name, String gender, String email) {
    return (root, query, criteriaBuilder) -> {

      List<Predicate> predicates = new ArrayList<>();

      if (email != null && !email.isBlank()) {
        predicates.add(criteriaBuilder.like(root.get("email"), "%" + email.toLowerCase() + "%"));
      }
      if (name != null && !name.isBlank()) {
        predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("fullName")),
            "%" + name.toLowerCase() + "%"));
      }
      if (gender != null && !gender.isBlank()) {
        predicates.add(criteriaBuilder.equal(root.get("gender"), gender));
      }

      query.orderBy(criteriaBuilder.desc(root.get("experience")));

      return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

    };
  }
}
