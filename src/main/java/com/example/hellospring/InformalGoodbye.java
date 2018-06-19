package com.example.hellospring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class InformalGoodbye implements GoodbyeHandler {


    @Override
    public String sayGoodbye() {
        return "C ya l8ter aligator";
    }
}
