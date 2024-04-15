package com.practice.dynamodb.service;

import java.util.List;
import java.util.Optional;

import com.practice.dynamodb.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	Optional<Employee> getEmployeeById(String id);
	
	List<Employee> getAllEmployees();
	
	Employee updateEmployee(Employee employee, String id);
	
	void deleteEmployeeById(String id);
}
