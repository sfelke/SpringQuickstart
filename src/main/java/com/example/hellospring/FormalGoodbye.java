package com.example.hellospring;

public class FormalGoodbye implements GoodbyeHandler {


    @Override
    public String sayGoodbye() {
        return "Looking forward to seeing you again.";
    }
}
