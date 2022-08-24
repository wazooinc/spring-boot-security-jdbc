package com.example.springbootsecurityjdbc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String root() {
        // anonymous access allowed
        return "index";
    }

    @GetMapping("/user")
    public String userOnly() {
        // user access required
        return "user";
    }

    @GetMapping("/admin")
    public String adminOnly() {
        // admin access required
        return "admin";
    }
    
}