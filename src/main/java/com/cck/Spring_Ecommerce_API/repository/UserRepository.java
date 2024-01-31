package com.cck.Spring_Ecommerce_API.repository;

import com.cck.Spring_Ecommerce_API.entity.User;
import com.cck.Spring_Ecommerce_API.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);

    User findByRole(UserRole userRole);
}
