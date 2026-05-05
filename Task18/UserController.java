package com.example.controller;

import org.springframework.web.bind.annotation.*;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService = new UserService();

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return userService.getUserName(id);
    }
}
