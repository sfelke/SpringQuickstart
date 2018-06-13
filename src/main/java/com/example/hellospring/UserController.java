package com.example.hellospring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private GreetingHandler greetingHandler;

    public UserController(GreetingHandler greetingHandler){
        this.greetingHandler = greetingHandler;
    }

    @RequestMapping("/hello/{user}")
    public String helloUserPath(@PathVariable String user){
        return greetingHandler.sayHi() + " from " + user;
    }

    @RequestMapping("/hello")
    public String helloUserParam(@RequestParam String user){
        return "hello " + user;
    }
}
