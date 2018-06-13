package com.example.hellospring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private GreetingHandler greetingHandler;

    private List<User> users = new ArrayList<>();


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

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        users.add(user);
    }

    @RequestMapping(value = "/user")
    public List<User> createUser(){
        return users;
    }

}
