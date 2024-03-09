package com.infosys.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="project_service")
public class Project {
	
	@Id
	private Long project_id;
	@Column
	private String project_title;
	@Column
	private String project_language;
	@Column
	private Long employee_id;
	
	

}
