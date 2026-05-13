package com.EP.backend.repository;

import com.EP.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for User persistence operations.
 *
 * JpaRepository already gives you common CRUD methods, so do not add methods
 * unless you actually need custom queries.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
