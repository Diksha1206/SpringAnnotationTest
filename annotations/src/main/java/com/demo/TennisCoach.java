package com.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {        
        return "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {        
        return null;
    }  

   // @PostConstruct // Not able to import the annotations. They might be removed
    public void doMyStartUpStuff() {
        System.out.println("Inside doMyStartUp method");
    }

    // @PreDestroy // Not able to import the annotations. They might be removed
    public void doMyCleanUpMethod() {
        System.out.println("Inside my doMyCleanUp method");
    }
}