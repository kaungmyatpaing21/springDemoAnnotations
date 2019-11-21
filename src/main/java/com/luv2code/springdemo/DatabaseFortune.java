package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Database Fortune: You are lucky today.";
    }
}
