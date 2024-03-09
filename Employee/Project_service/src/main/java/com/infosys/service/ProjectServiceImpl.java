package com.infosys.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Entity.Project;
import com.infosys.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository PR;
	
	@Override
	public void Create(Project p) {
		PR.save(p);
	}

	@Override
	public List<Project> getAll() {
		return PR.findAll();
	}

	@Override
	public Project getProjectById(Long id) {
		if(PR.findById(id).isEmpty())
		{
			return null;
		}
		else
		{
			return PR.findById(id).get();
		}
	}

	@Override
	public List<Project> getprojectByEmployeeId(Long id) {

		List<Project> pro=PR.findAll();
		return pro.stream().filter(project->project.getEmployee_id()==id).collect(Collectors.toList());
		}
	}
