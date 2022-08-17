package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.EmployeeSkills;

public interface EmployeeSkillsRepo extends JpaRepository<EmployeeSkills, Integer> {

	 List<EmployeeSkills> findBySkillName(String skillName);
	 
	 EmployeeSkills findByApprovedBy(String approvedBy);

	 

	 
	 
}
