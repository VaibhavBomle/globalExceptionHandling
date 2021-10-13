package com.globalexceptionhanding.GlobalExceptionHandling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.globalexceptionhanding.GlobalExceptionHandling.custome.exception.EmptyInputExcepton;
import com.globalexceptionhanding.GlobalExceptionHandling.custome.exception.NoDataFoundException;
import com.globalexceptionhanding.GlobalExceptionHandling.model.Employee;
/**
 * Service for Employee
 * @author Vaibahv
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterf {

	public static List<Employee> empList = new ArrayList<>();

	@Override
	public List<Employee> createEmployee(Employee employee) {

		if (employee.getName().isEmpty()) {
			throw new EmptyInputExcepton("601", "Input Filed are empty");
		}
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
	public Employee getEmpById(Long id) {
		Employee emp = null;
		if (!empList.isEmpty()) {
			for (Employee employee : empList) {
				if (employee.getEmpId().equals(id)) {
					emp = employee;
					break;
				}
			}
		}else {
			throw new NoDataFoundException("404", "No data found");
		}
		if(emp == null) {
			throw new NoDataFoundException("404", "No data found for perticular employee Id: "+id);
		}
		return emp;
	}
}
