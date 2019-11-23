package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballJavaConfigDemoApp {
    public static void main(String[] args) {

        //load the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("footballCoach", Coach.class);

        //call a method on a bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//        System.out.println(theCoach.getEmail());
//        System.out.println(theCoach.getTeam());

        //close the context
        context.close();
    }
}
