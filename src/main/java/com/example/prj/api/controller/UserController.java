package com.example.prj.api.controller;

import com.example.prj.api.model.User;
import com.example.prj.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
private UserServices userService;
@Autowired
public UserController(UserServices userService){
    this.userService =userService;
}





    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional<User> user = userService.getUser(id);
        return (User) user.orElse(null);
    }

        }