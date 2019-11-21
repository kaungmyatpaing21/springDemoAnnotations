package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Rest Fortune: You are lucky today";
    }
}
