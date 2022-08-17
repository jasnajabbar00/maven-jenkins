package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.entity.SkillsReference;
import com.example.demo.repo.SkillsReferenceRepo;

@Service
public class SkillReferenceService {

	@Autowired
	private SkillsReferenceRepo repo;

	public SkillsReference save(SkillsReference entity) {
		
		return this.repo.save(entity);
	}
	
	public List<SkillsReference> findAll(){
		
		return this.repo.findAll();
	}
}
