package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScoprDemoApp {
    
    public static void main(String[] args) {
        
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        Coach alphaCoach = context.getBean("thatSillyCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("Result is" +result);

        System.out.println("Memory location for theCoach"+ theCoach);
        System.out.println("Memory location for alphaCoach" + alphaCoach);
    }
}
