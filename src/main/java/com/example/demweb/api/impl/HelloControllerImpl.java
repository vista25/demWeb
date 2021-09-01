package com.example.demweb.api.impl;

import com.example.demweb.api.interfaces.Hello;
import com.example.demweb.repository.UserRepository;
import com.example.demweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloControllerImpl implements Hello {

    @Autowired
    UserService userService;

    @Override
    public String getHome() {
        return "<b>HomePage</b>";
    }

    @Override
    public String getHello() {
        return "Hello World!!!";
    }

    @Override
    public String getPageAdmin(Principal principal) {
        System.out.println(userService.getUserAll());
        return "<h1>Wellcome ADMIN!!!</h1>";
    }

    @Override
    public String getPageUser() {
        return "<h2>Wellcome User!!!</h2>";
    }
}
