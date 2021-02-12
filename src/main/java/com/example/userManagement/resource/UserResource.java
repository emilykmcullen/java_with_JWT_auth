package com.example.userManagement.resource;


import com.example.userManagement.domain.User;
import com.example.userManagement.exception.domain.EmailExistException;
import com.example.userManagement.exception.domain.ExceptionHandling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/", "/user"})
public class UserResource extends ExceptionHandling {

    @GetMapping("/user")
    public String showUser() throws EmailExistException{
//        return "application works";
        throw new EmailExistException("This email address is already taken.");
    }
}
