package com.globalexceptionhanding.GlobalExceptionHandling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.globalexceptionhanding.GlobalExceptionHandling.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterf {

	public static List<Employee> empList = new ArrayList<>();

	@Override
	public List<Employee> createEmployee(Employee employee) {

		createEmployeeList(employee);
		// TODO Auto-generated method stub
		return getListOfEmployee();
	}

	public List<Employee> getListOfEmployee() {
		return empList;
	}

	public void createEmployeeList(Employee employee) {
		empList.add(employee);
	}

	@Override
	public Employee getEmpById(Long Id) {
		for (Employee employee : empList) {
			if (employee.getEmpId().equals(Id)) {
				return employee;
			}
		}
		return null;
	}
}
