package com.app.springaop;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class MrfTyre implements Tyre {

	private int guarantee;
	private String brandName;

	public MrfTyre(int guarantee, String brandName) {
		super();
		this.guarantee = guarantee;
		this.brandName = brandName;
	}
	
	public MrfTyre() {
	}

	@Override
	public String getDurability() {
		return brandName + " Durable for : " + guarantee + " KM";
	}

	@PostConstruct
	void init() {
		System.out.println("MRF initialized");
	}

	@PreDestroy
	void destroy() {
		System.out.println("MRF destroyed");
	}

}
