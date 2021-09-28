package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AnnotationDemoApp 
{
    public static void main( String[] args )
    {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        // call a methos on the bean 
        System.out.println(theCoach.getDailyWorkout());

        // default bean id example
        Coach anotherCoach = context.getBean("volleyballCoach", Coach.class);

        System.out.println(anotherCoach.getDailyWorkout());

        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println("Cricket Coach: "+cricketCoach.getDailyFortune());
        
        // close the context
        context.close();
    }
}