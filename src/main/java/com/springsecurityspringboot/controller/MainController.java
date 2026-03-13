package com.springsecurityspringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/arsh")
    @ResponseBody
    public String hello() {
        return "hello Arsh";
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
