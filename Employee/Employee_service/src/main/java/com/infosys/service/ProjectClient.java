package com.infosys.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.entity.Project;
@FeignClient(url="http://localhost:8081",name="PROJECR-REGISTRY")
public interface ProjectClient {
	
	@GetMapping("/employee/project/{id}")
	List<Project> getAllProjectById(@PathVariable Long id);

}
