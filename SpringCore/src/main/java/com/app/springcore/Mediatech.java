package com.app.springcore;

public class Mediatech implements IProcessor {
	
	private String version;
	private String year;
	
	public Mediatech() {
	}

	public Mediatech(String version, String year) {
		super();
		this.version = version;
		this.year = year;
	}

	public void execute() {
		
		System.out.println("MediaTech : "+year+" "+version);
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
