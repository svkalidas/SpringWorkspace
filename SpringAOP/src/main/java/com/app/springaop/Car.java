package com.app.springaop;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("MRF")
	private Tyre tyre;
	
	public void getTyreBrand() {
		tyre.getDurability();
	}
	
	
	
	public Tyre getTyre() {
		return tyre;
	}



	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



	@PostConstruct
	void init() {
		System.out.println("Car initialized");
	}
	
	@PreDestroy
	void destroy() {
		System.out.println("Car destroyed");
	}
}
