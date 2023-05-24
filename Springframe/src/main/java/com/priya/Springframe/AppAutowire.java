package com.priya.Springframe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAutowire 
{
    public static void main( String[] args )
    {
   	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	CarAutowire c = (CarAutowire) context.getBean("carAutowire");
    	c.drive();

    	
    	
    }
}
