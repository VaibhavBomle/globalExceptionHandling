package com.globalexceptionhanding.GlobalExceptionHandling.service;

import java.util.List;

import com.globalexceptionhanding.GlobalExceptionHandling.model.Employee;

public interface EmployeeServiceInterf {
	
	public List<Employee> createEmployee(Employee employee);
	
	public Employee getEmpById(Long Id);

}
