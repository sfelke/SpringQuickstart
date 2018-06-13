package com.example.hellospring;

import org.springframework.stereotype.Component;

@Component
public class GreetingHandler {

    public String sayHi(){
        return "HI";
    }

}
