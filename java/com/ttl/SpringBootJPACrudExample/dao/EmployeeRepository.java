package com.ttl.SpringBootJPACrudExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttl.SpringBootJPACrudExample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
