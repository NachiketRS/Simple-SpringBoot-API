package com.ttl.SpringBootJPACrudExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttl.SpringBootJPACrudExample.dao.EmployeeRepository;
import com.ttl.SpringBootJPACrudExample.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository obj;
	
	@RequestMapping("/")
	String home () {
		return "Hello! Warm Welcome to Nachiket's First SpringBoot Project!!!  Please enter /employees in the url to find employee details.";
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return obj.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(value="id") Long empId)
	{
		Optional<Employee> emp=obj.findById(empId);
		return emp.get();
	}
}


