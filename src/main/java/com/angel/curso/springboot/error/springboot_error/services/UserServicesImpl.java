package com.angel.curso.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.curso.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServicesImpl implements IUserServices {

    @Autowired
    private List<User> users;


    @Override
    public List<User> findAll() {

        return users;
    }

    @Override
    public Optional<User> findById(Long id) {

        Optional<User> user = users.stream().filter( usr -> usr.getId().equals(id)).findFirst();
        // for (User u : users) {
        //     if (u.getId().equals(id)) {
        //         user = u;
        //         break;
        //     }
            return user;
        // }

    }

}
