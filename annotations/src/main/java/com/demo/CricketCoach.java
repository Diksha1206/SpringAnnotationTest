package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    // Field injection
    @Autowired
    @Qualifier("randomFortuneService")   // Because there are multiple implementations of Fortune sercode, autowired would not know which one to implement, so we use Qualifier to explicitlt mention which implementation to use.
    private FortuneService theFortuneService;


    // Constructor injection
    /*@Autowired
    public CricketCoach(FortuneService fortuneService) {
        this.theFortuneService = fortuneService;
    }*/

    public CricketCoach() {
        System.out.println("In the default constructor of CricketCoach");
    }

    // Setter injection
    // You can use @Autowired on any other method and not just setter methods. 
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.theFortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {       
        return "Practice batting and balling";
    }

    @Override
    public String getDailyFortune() {        
        return theFortuneService.getDailyFortune();
    }    
}
