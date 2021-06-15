package com.app.springaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.app.springaop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
public class CarConfig {

	@Bean("MRF")
	public MrfTyre getMrfTyre() {
		return new MrfTyre(2000, "MRF");
	}
	
	@Bean("TVS")
	public TvsTyre getTvsTyre() {
		return new TvsTyre(1500, "TVS");
	}
}
