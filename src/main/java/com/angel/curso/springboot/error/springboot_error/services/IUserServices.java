package com.angel.curso.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import com.angel.curso.springboot.error.springboot_error.models.domain.User;

public interface IUserServices {



    List<User> findAll();
    Optional<User> findById(Long id);


}
