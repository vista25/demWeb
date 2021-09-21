package com.example.demweb.api.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.security.Principal;

public interface Hello {

    @RequestMapping(value = "/")
    String getHome();

    @GetMapping(value = "/hi")
    String getHello();

    @GetMapping(value = "/admin")
    @ResponseStatus(HttpStatus.OK)
    String getPageAdmin(Principal principal);

    @GetMapping(value = "/user")
    String getPageUser();
}
