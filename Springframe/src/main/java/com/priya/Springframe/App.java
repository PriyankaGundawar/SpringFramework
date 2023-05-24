package com.priya.Springframe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Car c = new Car();
//        c.drive();
    	
//    	  Bike b = new Bike();
//    	  b.drive();
    	
    	//Instead of having same method in two diff classes with same behavior we can create Vehicle interface and implement that in Bike and Car class.
    	//Interface Vehicle will be having drive().
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj = (Vehicle) context.getBean("vehicle");
    	obj.drive();
    	
    }
}
