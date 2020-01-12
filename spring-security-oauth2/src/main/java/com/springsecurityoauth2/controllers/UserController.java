package com.springsecurityoauth2.controllers;

import com.springsecurityoauth2.security.AuthUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    public AuthUserDetails user(@AuthenticationPrincipal AuthUserDetails authUserDetails) {
        return authUserDetails;
    }
}
