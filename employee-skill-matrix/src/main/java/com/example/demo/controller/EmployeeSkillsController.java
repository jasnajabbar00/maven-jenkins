package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.service.EmployeeSkillService;

@RestController
@RequestMapping(path="api/v1/employeeSkills")
public class EmployeeSkillsController {

	@Autowired
	private EmployeeSkillService service;
	
	@PostMapping()
	public EmployeeSkills add(@RequestBody EmployeeSkills entity) {
		
		return this.service.save(entity);
	}
	@GetMapping
	public List<EmployeeSkills> findAll(){
		
		return this.service.findAll();
	}

	@GetMapping(path="/srch/{skillName}")
	public List<EmployeeSkills> findBySkillName(@PathVariable("skillName")String skillName) {
		
		return this.service.findBySkillName(skillName);
	}
	
	@GetMapping(path="/srch/{approvedBy}")
	public EmployeeSkills findByApprovedBy(@PathVariable("approvedBy")String approvedBy) {

		return this.service.findByApprovedBy(approvedBy);
		
	}
}
