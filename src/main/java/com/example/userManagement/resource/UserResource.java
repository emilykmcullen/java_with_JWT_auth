package com.example.userManagement.resource;


import com.example.userManagement.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping("/user")
    public String showUser(){
        return "application works";
    }
}
