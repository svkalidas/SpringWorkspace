package com.app.springaop;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TvsTyre  implements Tyre{
	
	private int guarantee;
	private String brandName;
	
	public TvsTyre() {
	}
	
	public TvsTyre(int guarantee, String brandName) {
		super();
		this.guarantee = guarantee;
		this.brandName = brandName;
	}
	
	public int getGuarantee() {
		return guarantee;
	}




	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}




	public String getBrandName() {
		return brandName;
	}




	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}




	@Override
	public String getDurability() {
		return brandName+" Durable for : "+guarantee;
	}
	
	@PostConstruct
	void init() {
		System.out.println("TVS initialized");
	}

	@PreDestroy
	void destroy() {
		System.out.println("TVS destroyed");
	}
}
