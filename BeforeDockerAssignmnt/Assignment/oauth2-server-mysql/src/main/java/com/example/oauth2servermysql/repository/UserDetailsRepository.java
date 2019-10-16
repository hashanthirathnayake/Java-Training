package com.example.oauth2servermysql.repository;

import com.example.oauth2servermysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserDetailsRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String name);
}
