package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}
