package com.priya.Springframe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppSam 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(SamsungConfig.class);
    	
    	Samsung s= factory.getBean(Samsung.class);
    	s.config();
    	
    	
    }
}
