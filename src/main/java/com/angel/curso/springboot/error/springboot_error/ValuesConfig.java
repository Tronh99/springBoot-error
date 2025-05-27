package com.angel.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.angel.curso.springboot.error.springboot_error.models.domain.User;

@Configuration
public class ValuesConfig {

    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Angel", "Ramirez"));
        users.add(new User(2L, "Ramon", "Roldan"));
        users.add(new User(3L, "Roberto", "Paredes"));
        users.add(new User(4L, "Enrique", "Bustos"));
        users.add(new User(5L, "Luis", "Haro"));

        return users;
    }

}
