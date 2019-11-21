package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class PracticeFortuneService implements FortuneService {

    @Value("${foo.fortune1}")
    private String fortune1;

    @Value("${foo.fortune2}")
    private String fortune2;

    @Value("${foo.fortune3}")
    private String fortune3;

    private String[] data;

    @PostConstruct
    public void setupMyData(){
        data = new String[3];
        data[0] = fortune1;
        data[1] = fortune2;
        data[2] = fortune3;
    }

    Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
