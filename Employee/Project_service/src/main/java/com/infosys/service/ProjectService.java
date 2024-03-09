package com.infosys.service;

import java.util.List;

import com.infosys.Entity.Project;

public interface ProjectService {
	
	public void Create(Project p);
	
	public List<Project> getAll();
	
	public Project getProjectById(Long id);
	
	public List<Project> getprojectByEmployeeId(Long id);
	
	

}
