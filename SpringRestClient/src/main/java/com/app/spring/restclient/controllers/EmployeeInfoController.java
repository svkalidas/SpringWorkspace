package com.app.spring.restclient.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.restclient.model.Employee;
import com.app.spring.restclient.service.EmployeeService;

@RestController
@RequestMapping(value = "/employeeInfo")
public class EmployeeInfoController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.getallEmployees();
	}

}
