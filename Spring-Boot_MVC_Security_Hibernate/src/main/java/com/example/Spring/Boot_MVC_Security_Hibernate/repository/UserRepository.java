package com.example.Spring.Boot_MVC_Security_Hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.Boot_MVC_Security_Hibernate.model.User;

@Repository
public interface UserRepository extends JpaRepository < User, Long > {
    User findByEmail(String email);
}