package com.practice.dynamodb.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.practice.dynamodb.model.Employee;

@EnableScan
public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
