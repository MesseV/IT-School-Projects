package com.itschool.productmanagement.controller;

import com.itschool.productmanagement.entities.UserModel;
import com.itschool.productmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String viewUsers (Model model) {
        List<UserModel> users = userService.displayUsers();
        model.addAttribute("users", users);
        return "user";
    }
}
