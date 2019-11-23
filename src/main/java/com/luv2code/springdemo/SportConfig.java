package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springdemo") // this is optional
public class SportConfig {

    // define bean for our sadFortuneService
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for our footballCoach and inject dependency (sadFortuneService)
    @Bean
    public Coach footballCoach(){
        return new FootballCoach(sadFortuneService());
    }
}
