package com.example.hellospring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class FormalGoodbye implements GoodbyeHandler {


    @Override
    public String sayGoodbye() {
        return "Looking forward to seeing you again.";
    }
}
