package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

@Entity
@Table(name="jasna1_employee_skill")
public class EmployeeSkills {

	@Id
	@SequenceGenerator(name = "jasnaSeq3", sequenceName = "sequence", initialValue = 101, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jasnaSeq3")
	@Column(name="emp_skills_id")
	int employeeSkillsId;
	
	@Column(name="emp_id")
	int employeeId;
	
	@Column(name="skill_id")
	int skillId;
	
	@Column(name="skill_name")
	String skillName;
	
	@Column(name="skill_experience")
	int skillExperience;
	
	@Column(name="status")
	String status;
	
	@Column(name="approved_by")
	String approvedBy;
	
	@DateTimeFormat(iso=ISO.TIME)
	@Column(name="approved_date")
	LocalDate approvedDate;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="created_date")
	LocalDate createdDate;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="modefied_date")
	LocalDate modefiedDate;
}
