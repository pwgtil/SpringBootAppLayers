package com.pwgtil.springbootapplayers.presentation;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.pwgtil.springbootapplayers.businesslayer.UserService;
import com.pwgtil.springbootapplayers.businesslayer.User;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.save(new User(
                user.getId(), user.getUsername(),
                user.getFirstName(), user.getLastName()));
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        return userService.findUserById(id);
    }
}
