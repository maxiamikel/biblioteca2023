package com.maxi.api.gbiblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maxi.api.gbiblioteca.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    

    @Query("Select u from User u")
    List<User> findAllUsers();
}
