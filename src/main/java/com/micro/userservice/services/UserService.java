package com.micro.userservice.services;

import com.micro.userservice.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User saveUser(User user);
    List<User> getAllUsers();
    User getUser(String userId);
}
