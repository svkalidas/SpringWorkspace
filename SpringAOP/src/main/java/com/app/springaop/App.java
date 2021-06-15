package com.app.springaop;

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
    	ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);
    	
    	//Here Two objects of MrfTyre and TvsTyre will be created in spring IOC container (in Application context) because, The beans for both classes
    	//are defined in the configuration class with argument constructor and also these classes are annotated with 
    	//@Component annotation, so while component scanning object of these classes are instantiated with no argument constructor
    	
    	Car car = applicationContext.getBean(Car.class);
    	
    	TvsTyre tvsTyre = (TvsTyre)applicationContext.getBean("TVS");
    	
    	tvsTyre.setGuarantee(2);
    	
    	tvsTyre.getBrandName();
    	
    	tvsTyre.getGuarantee();
    	
    	tvsTyre.getDurability();
    	
    	car.setTyre(tvsTyre);
    	
    	car.getTyreBrand();
    	
    	applicationContext.close();
    }
}
