package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Employee;
import com.infosys.entity.Project;
import com.infosys.service.EmployeeService;
import com.infosys.service.ProjectClient;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService ES;
	
	@Autowired
	private ProjectClient PC;
	
	@PostMapping
	public void save(@RequestBody Employee e)
	{
		ES.createEmployee(e);
	}
	
	@GetMapping
	public List<Employee> getAll()
	{
		return ES.getAll();
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable Long id)
	{
		return ES.getEmployeeById(id);
	}
	
	@GetMapping("/{date}")
	public List<Employee> getByDate(@PathVariable String date)
	{
		return ES.getByDate(date);
	}
	
	@GetMapping("/project/{id}")
	public List<Project> getProjectByid(@PathVariable Long id)
	{
		return PC.getAllProjectById(id);
	}

}
