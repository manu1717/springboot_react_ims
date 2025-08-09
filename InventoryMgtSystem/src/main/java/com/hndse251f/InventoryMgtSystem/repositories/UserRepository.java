package com.hndse251f.InventoryMgtSystem.repositories;

import com.hndse251f.InventoryMgtSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
