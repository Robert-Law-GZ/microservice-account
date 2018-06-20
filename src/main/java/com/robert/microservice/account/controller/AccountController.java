package com.robert.microservice.account.controller;

import com.robert.microservice.account.entity.User;
import com.robert.microservice.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/profile/{id}")
    public User enter(@PathVariable Long id){
        User user=userRepository.findOne(id);
        return user;
    }

    @GetMapping(value = "/list")
    public List<User> userList(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/sign")
    public String sign(Model model){
        model.addAttribute("error","adfka dfasdfasf");
        return "main";
    }
}
