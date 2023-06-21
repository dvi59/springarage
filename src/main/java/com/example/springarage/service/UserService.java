package com.example.springarage.service;

import com.example.springarage.entity.User;
import com.example.springarage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User userAdd(User user){
        return userRepository.save(user);
    }

}
