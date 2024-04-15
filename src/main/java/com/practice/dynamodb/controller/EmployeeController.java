package com.practice.dynamodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dynamodb.common.Response;
import com.practice.dynamodb.model.Employee;
import com.practice.dynamodb.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Response<Employee> createEmployee(@RequestBody Employee employee) {
		return new Response<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public Response<Employee> getEmployeeById(@PathVariable String id) {
		Optional<Employee> response = employeeService.getEmployeeById(id);
		return new Response<>(response.orElse(null), HttpStatus.OK);
	}
	
	@GetMapping
	public Response<List<Employee>> getAllEmployees() {
		return new Response<>(employeeService.getAllEmployees(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public Response<Employee> createEmployee(@RequestBody Employee employee, @PathVariable String id) {
		return new Response<>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public Response<String> deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployeeById(id);
		return new Response<>("Success", HttpStatus.OK);
	}
	
}
