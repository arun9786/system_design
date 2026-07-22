package org.security.example.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.security.example.dto.LoginRequest;
import org.security.example.dto.LoginResponse;
import org.security.example.dto.RegisterRequest;
import org.security.example.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public String register(
            @Valid @RequestBody RegisterRequest request) {

        return service.register(request);

    }

    @PostMapping("/login")
    public LoginResponse login(
            @Valid @RequestBody LoginRequest request) {

        return service.login(request);

    }

}
