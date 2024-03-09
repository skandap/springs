package com.infosys.service;

import java.util.List;

import com.infosys.entity.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee e);
	
	public List<Employee> getAll();
	
	public Employee getEmployeeById(Long id);
	
	
	public List<Employee> getByDate(String date);

}
