package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.Entity.Project;
import com.infosys.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	
	@Autowired
	public ProjectService PS;
	
	@PostMapping
	public void CreateProject(@RequestBody Project p)
	{
		PS.Create(p);
	}

	@GetMapping
	public List<Project> getAll()
	{
		return PS.getAll();
	}
	
	@GetMapping("/{id}")
	public Project Geybyid(@PathVariable Long id)
	{
		return PS.getProjectById(id);
	}
	
	@GetMapping("/employee/{Eid}")
	public List<Project> getProEmplId(@PathVariable Long Eid)
	{
		return PS.getprojectByEmployeeId(Eid);
	}
}
