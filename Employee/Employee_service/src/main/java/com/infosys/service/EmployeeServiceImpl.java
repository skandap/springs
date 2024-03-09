package com.infosys.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Employee;
import com.infosys.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository ER;

	@Override
	public void createEmployee(Employee e) {
		ER.save(e);
	}

	@Override
	public List<Employee> getAll() {

		return ER.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return ER.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
		
	}

	@Override
	public List<Employee> getByDate(String date) {
		
		List<Employee> employees=ER.findAll();
		
		return employees.stream().filter(employee->employee.getData_of_joining()==date).collect(Collectors.toList());
	}

		

}
