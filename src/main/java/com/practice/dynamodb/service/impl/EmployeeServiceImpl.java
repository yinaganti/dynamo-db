package com.practice.dynamodb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dynamodb.model.Employee;
import com.practice.dynamodb.repository.EmployeeRepository;
import com.practice.dynamodb.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, String id) {
		employee.setId(id);
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(String id) {
		employeeRepository.deleteById(id);
	}

}
