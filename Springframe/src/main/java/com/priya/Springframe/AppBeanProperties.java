package com.priya.Springframe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppBeanProperties 
{
    public static void main( String[] args )
    {
   	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Tyre obj = (Tyre) context.getBean("tyre");
    	System.out.println(obj);
    	
    	
    }
}
