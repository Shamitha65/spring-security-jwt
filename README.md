# Spring Security JWT Authentication

A Spring Boot application implementing secure REST APIs using Spring Security 6, BCrypt password encryption, and stateless JWT Bearer Token authentication.

## Features

- User registration
- User login
- BCrypt password encryption
- JWT token generation
- JWT token validation
- Stateless authentication
- Custom UserDetailsService
- Role-based authorization
- USER and ADMIN roles
- Custom 401 Unauthorized response
- Custom 403 Forbidden response
- Protected REST endpoints
- MySQL database integration
- Postman API testing

## Technologies

- Java 17
- Spring Boot 3.5.5
- Spring Security 6
- Spring Data JPA
- MySQL
- JWT (JJWT)
- Maven
- Postman

## Project Structure

src/main/java/com/example/security
├── config
│   └── SecurityConfig.java
├── controller
│   ├── AuthController.java
│   └── TestController.java
├── dto
│   ├── AuthResponse.java
│   ├── LoginRequest.java
│   └── RegisterRequest.java
├── entity
│   └── User.java
├── repository
│   └── UserRepository.java
├── service
│   └── AuthService.java
└── security
    ├── CustomAccessDeniedHandler.java
    ├── CustomAuthenticationEntryPoint.java
    ├── CustomUserDetailsService.java
    ├── JwtAuthenticationFilter.java
    └── JwtService.java