package com.infosys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Project {
	
	
	private Long project_id;
	
	private String project_title;
	
	private String project_language;

	private Long employee_id;
	
	

}
