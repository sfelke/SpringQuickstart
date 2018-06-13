package com.example.hellospring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/hello/{user}")
    public String helloUserPath(@PathVariable String user){
        return "hello " + user;
    }

    @RequestMapping("/hello")
    public String helloUserParam(@RequestParam String user){
        return "hello " + user;
    }
}
