package com.app.SpringCoreAnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.app.SpringCoreAnnotationConfig")
public class AppConfig {
	
	@Bean
	public Laptop getLaptop() {
		return new Laptop();
	}

//	@Bean("intelProcessor")
//	public IProcessor getProcessor() {
//		return new Intel("i3", "Octacore");
//	}
//	
//	@Bean("macProcessor")
//	public IProcessor getMacProcessor() {
//		return new MacProcessor("A9", "Octacore");
//	}
}
