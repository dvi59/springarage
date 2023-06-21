package com.example.springarage.controller;

import com.example.springarage.entity.User;
import com.example.springarage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User userAdd(@RequestBody User user){
        return userService.userAdd(user);
    }
}
