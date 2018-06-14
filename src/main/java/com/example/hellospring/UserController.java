package com.example.hellospring;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private GreetingHandler greetingHandler;
    private UserRepository userRepository;

    public UserController(GreetingHandler greetingHandler, UserRepository userRepository){
        this.greetingHandler = greetingHandler;
        this.userRepository = userRepository;
    }

    @RequestMapping("/hello/{user}")
    public String helloUserPath(@PathVariable String user){
        return greetingHandler.sayHi() + " from " + user;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        userRepository.save(user);
    }

    @RequestMapping(value = "/user")
    public List<User> createUser(){
        return userRepository.findAll();
    }

}
