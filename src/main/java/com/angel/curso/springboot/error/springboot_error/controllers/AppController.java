package com.angel.curso.springboot.error.springboot_error.controllers;

import java.security.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.error.springboot_error.models.domain.User;
import com.angel.curso.springboot.error.springboot_error.services.UserServicesImpl;




@RestController
@RequestMapping("/app")

public class AppController {

    @Autowired
    private UserServicesImpl service;



    @GetMapping
    public String index(){

        int value = 100/0;
        //int value = Integer.parseInt("hola");
        System.out.print(value);
        return "ok 200";
    }


    @GetMapping("/show/{id}")
    public User showUsers(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }
    

}
