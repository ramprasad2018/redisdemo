package com.example.springboot_redisom_practice.repository;

import com.example.springboot_redisom_practice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
