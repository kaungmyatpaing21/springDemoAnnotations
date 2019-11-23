package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SwimCoach implements Coach {

    @Autowired
    @Qualifier("practiceFortuneService")
    private FortuneService fortuneService;

//    @Value("${foo.email}")
//    private String email;
//
//    @Value("${foo.team}")
//    private String team;

    public SwimCoach(){
        // no-argument constructor
    }

    // init method
    @PostConstruct
    public void doMyStartupWork(){
        System.out.println("After Bean Construct: Inside the doMyStartupWork.");
    }

    // Destroy method
    @PreDestroy
    public void doMyFinishedWork(){
        System.out.println("After Bean Destroy: Inside the doMyFinishedWork.");
    }

    @Override
    public String getDailyWorkout() {
        return "swim 2 times a day.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public String getTeam() {
//        return team;
//    }

}
