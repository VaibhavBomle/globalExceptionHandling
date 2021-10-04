package com.globalexceptionhanding.GlobalExceptionHandling.controller;

import javax.ws.rs.Path;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.globalexceptionhanding.GlobalExceptionHandling.model.Employee;

@RestController
@Path("/api/v1")
public class EmployeeController {
	
	
	public ResponseEntity<?> createEmployee(Employee employee){
		return null;
		
	}
	
	
	

}
