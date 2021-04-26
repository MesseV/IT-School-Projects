package com.itschool.productmanagement.services;

import com.itschool.productmanagement.entities.UserModel;
import com.itschool.productmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> displayUsers() {
        List<UserModel> users = userRepository.findAll();
        return users;
    }

}
