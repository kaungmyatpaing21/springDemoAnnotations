package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "It's pretty sad today boy :( ...";
    }
}
