package com.example.demopostgres.repository;

import com.example.demopostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User,Integer> {
}
