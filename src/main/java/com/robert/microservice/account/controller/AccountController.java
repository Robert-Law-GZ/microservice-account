package com.robert.microservice.account.controller;

import com.robert.microservice.account.entity.User;
import com.robert.microservice.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/profile/{id}")
    public User login(@PathVariable Long id){
        User user=userRepository.findOne(id);
        return user;
    }

    @GetMapping(value = "/list")
    public List<User> userList(){
        return userRepository.findAll();
    }

}
