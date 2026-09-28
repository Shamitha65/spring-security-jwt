package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // Accessible by USER and ADMIN
    @GetMapping("/api/user/profile")
    public String userProfile() {
        return "Welcome to the USER profile";
    }

    // Accessible only by ADMIN
    @GetMapping("/api/admin/dashboard")
    public String adminDashboard() {
        return "Welcome to the ADMIN dashboard";
    }

    // Any authenticated user
    @GetMapping("/api/protected")
    public String protectedEndpoint() {
        return "You have accessed a protected endpoint";
    }
}
