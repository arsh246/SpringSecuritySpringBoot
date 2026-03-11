package com.springsecurityspringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/arsh")
    public String hello() {
        return "hello";
    }

    @GetMapping("/arsh/welcome")
    @ResponseBody
    public String welcome() {
        return "welcome Budddddy";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
