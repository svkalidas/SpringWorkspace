package com.app.spring.restservice.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.restservice.bo.EmployeeService;
import com.app.spring.restservice.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	@ResponseBody
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping(path = "/{empId}")
	@ResponseBody
	public Employee getEmployee(@PathVariable(name = "empId") int empId) {
		return employeeService.getEmployee(empId);
	}
	
	@PostMapping
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@DeleteMapping("/{empId}")
	public void deleteEmployee(@PathVariable (name = "empId") int empId) {
		employeeService.delete(empId);
	}
}
