package com.angel.curso.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.angel.curso.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServicesImpl implements IUserServices{

    private List<User> users;

    public UserServicesImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L,"Angel", "Ramirez"));
        users.add(new User(2L,"Ramon", "Roldan"));
        users.add(new User(3L,"Roberto", "Paredes"));
        users.add(new User(4L,"Enrique", "Bustos"));
        users.add(new User(5L,"Luis", "Haro"));

    }

    @Override
    public List<User> findAll() {
        
        return users;
    }

    @Override
    public User findById(Long id) {

        User user = null;
        for (User u : users) {
            if(u.getId().equals(id)){
                user = u;
                break;
            }

        }
        
       return user;
    }

    

}
