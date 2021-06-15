package com.app.spring.restclient.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.spring.restclient.model.Employee;
import com.app.spring.restclient.utility.ClientInvoker;

@Service
public class EmployeeService {

	@Autowired
	ClientInvoker clientInvoker;
	
	public List<Employee> getallEmployees(){
		ResponseEntity<Employee[]> forEntity = clientInvoker.getInvoker().getForEntity(clientInvoker.getUri()+"employee", Employee[].class);
		return Arrays.asList(forEntity.getBody());
	}
	
}
