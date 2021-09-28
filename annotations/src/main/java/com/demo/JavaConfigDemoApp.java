package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
    
        AnnotationConfigApplicationContext newContext = new AnnotationConfigApplicationContext(SportConfig.class);        
        Coach theCoach = newContext.getBean("cricketCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        newContext.close();
    }    
}
