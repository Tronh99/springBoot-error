package com.angel.curso.springboot.error.springboot_error.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {



    @GetMapping("/app")   
    public String index(){

        int value = 100/0;
        //int value = Integer.parseInt("hola");
        System.out.print(value);
        return "ok 200";
    }


}
