package com.learning.predicates.repositories;

import com.learning.predicates.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>,
    JpaSpecificationExecutor<User> {
}
