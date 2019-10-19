package com.javagda25.serviceSecurity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
@AllArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tylkodlakozakow")
    public String kozaki(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "login-form";
    }
}
