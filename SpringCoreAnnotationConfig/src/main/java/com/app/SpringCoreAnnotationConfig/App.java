package com.app.SpringCoreAnnotationConfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Laptop laptop = applicationContext.getBean(Laptop.class);
    	
    	laptop.getProcessorInfo();
    	
    	applicationContext.close();
    }
}
