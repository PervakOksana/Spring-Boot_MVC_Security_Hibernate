package com.example.Spring.Boot_MVC_Security_Hibernate.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Spring.Boot_MVC_Security_Hibernate.model.User;
import com.example.Spring.Boot_MVC_Security_Hibernate.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

}
