package com.springboot.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
