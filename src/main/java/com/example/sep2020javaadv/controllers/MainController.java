package com.example.sep2020javaadv.controllers;

import com.example.sep2020javaadv.dao.UserDAO;
import com.example.sep2020javaadv.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private UserDAO userDAO;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("!!!!!!!!");
        return "hello";
    }

    @GetMapping("/hi")
    public String hi() {
        System.out.println("!!!!!!!!");
        return "hi";
    }

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setId(1111);
        user.setName("kokos");
        return user;
    }


    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> userList = userDAO.findAll();
        return userList;
    }


    @GetMapping("/saveUser")
    public void saveUser(@RequestParam String name) {
        User user = new User(name);
        userDAO.save(user);
    }


}
