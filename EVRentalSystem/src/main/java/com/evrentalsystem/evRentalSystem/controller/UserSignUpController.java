package com.evrentalsystem.evRentalSystem.controller;

import com.evrentalsystem.evRentalSystem.dto.request.UserSignupRequest;
import com.evrentalsystem.evRentalSystem.entity.User;
import com.evrentalsystem.evRentalSystem.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,  makeFinal = true)
public class UserSignUpController {
    UserService userService;

    @PostMapping("/signup/renter")
    public ResponseEntity<?> signupRenter(@Valid @RequestBody UserSignupRequest request) {
        User user = userService.signupRenter(request);
        return ResponseEntity.ok("Account created successfully!");
    }
}
