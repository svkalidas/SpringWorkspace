package com.app.spring.restclient.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private String name;
	private String job;
	private int yearOfExperience;
	
	public Employee() {
	}
	
	public Employee(int id, String name, String job, int yearOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.yearOfExperience = yearOfExperience;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
}
