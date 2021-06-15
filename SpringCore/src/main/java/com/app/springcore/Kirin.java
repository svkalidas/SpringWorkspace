package com.app.springcore;

import org.springframework.stereotype.Component;

@Component("kirin")
public class Kirin implements IProcessor {
	
	private String version;
	private String year;
	
	public Kirin() {
		this.version = "655";
		this.year = "2017";
	}

	public void execute() {
		System.out.println("Kirin : "+year+" "+version);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	
}
