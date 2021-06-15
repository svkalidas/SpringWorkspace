package com.app.springcore;

public class Snapdragan implements IProcessor {
	
	private String version;
	private String year;
	
	public Snapdragan(String version, String year) {
		super();
		this.version = version;
		this.year = year;
	}

	public void execute() {
		System.out.println("Snapdragan "+year+ " "+version);
	}

}
