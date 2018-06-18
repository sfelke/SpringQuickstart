package com.example.hellospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingHandler {

    @Value("${user.standardGreeting}")
    private String standardGreeting;

    public String sayHi(){
        return this.standardGreeting;
    }

}
