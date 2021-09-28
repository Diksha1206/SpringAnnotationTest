package com.demo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    @Override
    public String getDailyWorkout() {       
        return "Do not miss your volleyball classes";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
