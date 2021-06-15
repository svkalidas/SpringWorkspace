package com.app.spring.restservice.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.app.spring.restservice.model.Employee;

@Service
public class EmployeeService {

	private Random autoId = new Random(100);
	private Random exp = new Random(15);

	private List<Employee> employees = new ArrayList<>();

	public Employee createNewEmployee() {
		Employee employee = new Employee(autoId.nextInt(), "Alex" + autoId.nextInt(), "SoftwareEngineer",
				exp.nextInt());
		employees.add(employee);
		return employee;
	}
	
	public Employee addEmployee(Employee emp) {
		employees.add(emp);
		return emp;
	}

	public List<Employee> getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int empId) {
		return employees.stream().filter(emp -> (emp.getId() == empId)).findFirst().orElse(new Employee());
	}

	public Employee update(Employee employee) {

		Employee emp = employees.stream().filter(emp1 -> (emp1.getId() == employee.getId())).findFirst().orElse(null);

		if (emp != null) {
			employees.remove(emp);
			employees.add(employee);
		} else {
			employees.add(employee);
		}
		return employee;
	}

	public void delete(int empId) {
		Employee emp = employees.stream().filter(emp1 -> (emp1.getId() == empId)).findFirst().orElse(null);
		if (emp != null) {
			employees.remove(emp);
		}
	}
}
