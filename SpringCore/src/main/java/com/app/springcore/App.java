package com.app.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*XML based configuration */
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	MobilePhone mobilePhone1 = (MobilePhone)context.getBean("mobilePhone1");
    	
    	if(mobilePhone1 != null) {
    		System.out.println("Mobile1 created");
    		mobilePhone1.start();;
    	}
    	
    	MobilePhone mobilePhone2 = (MobilePhone)context.getBean("mobilePhone2");
    	
    	if(mobilePhone2 != null) {
    		System.out.println("Mobile2 created");
    		mobilePhone2.start();;
    	}
    	
    	MobilePhone mobilePhone3 = (MobilePhone)context.getBean("mobilePhone3");
    	
    	if(mobilePhone3 != null) {
    		System.out.println("Mobile3 created");
    		mobilePhone3.start();;
    	}
    	
    	context.close();
    }
}
