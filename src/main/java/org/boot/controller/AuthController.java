package org.boot.controller;

import org.boot.dto.ResponseDTO;
import org.boot.dto.SignUpDTO;
import org.boot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService authservice;

    @PostMapping("/signUp")
    public ResponseDTO<?> signUp(@RequestBody SignUpDTO requestBody){
        System.out.println(111111111);
        System.out.println(requestBody);
        ResponseDTO<?> result = authservice.signUp(requestBody);
        return result;
    }
}
