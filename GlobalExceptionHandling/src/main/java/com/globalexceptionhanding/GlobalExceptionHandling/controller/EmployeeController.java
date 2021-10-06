package com.globalexceptionhanding.GlobalExceptionHandling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globalexceptionhanding.GlobalExceptionHandling.model.Employee;
import com.globalexceptionhanding.GlobalExceptionHandling.service.EmployeeServiceInterf;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeServiceInterf employeeServiceInterf;
	
	@PostMapping("/employee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
		
		List<Employee> empList = employeeServiceInterf.createEmployee(employee);
		return  new ResponseEntity(empList, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity getEmployee(@PathVariable("empId") Long empId) {
		System.out.println(empId);
		Employee employee = employeeServiceInterf.getEmpById(empId);
		return new ResponseEntity(employee, HttpStatus.FOUND);
	}
	
	

}
