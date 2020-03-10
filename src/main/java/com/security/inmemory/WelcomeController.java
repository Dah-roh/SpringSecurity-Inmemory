package com.security.inmemory;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String home(Authentication authentication){
            String userName = authentication.getName();
        return "Welcome to the Homepage "+userName;
    }
}
