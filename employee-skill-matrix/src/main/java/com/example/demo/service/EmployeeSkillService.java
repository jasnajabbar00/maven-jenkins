package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.repo.EmployeeSkillsRepo;

@Service
public class EmployeeSkillService {

	@Autowired
	private EmployeeSkillsRepo repo;
	
	public EmployeeSkills save(EmployeeSkills entity) {
		
		return this.repo.save(entity);
	}
	
	public List<EmployeeSkills> findAll(){
		
		return this.repo.findAll();
	}
	
	public List<EmployeeSkills> findBySkillName(String skillName)
	{
		return this.repo.findBySkillName(skillName);
	}

	public EmployeeSkills findByApprovedBy(String approvedBy)
	{
		return this.repo.findByApprovedBy(approvedBy);
	}
}
