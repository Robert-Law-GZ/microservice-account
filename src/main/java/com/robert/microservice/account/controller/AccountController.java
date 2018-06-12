package com.robert.microservice.account.controller;

import com.robert.microservice.account.entity.User;
import com.robert.microservice.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/user/profile/{id}")
    public User login(@PathVariable Long id){
        User user=userRepository.findById(id).get();
        return user;
    }

    @GetMapping(value = "/user/list")
    public List<User> userList(){
        return userRepository.findAll();
    }

}
