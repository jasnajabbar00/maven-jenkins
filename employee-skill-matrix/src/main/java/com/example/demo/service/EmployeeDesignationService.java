package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.repo.EmployeeDesignationRepo;

@Service
public class EmployeeDesignationService {

	@Autowired
	private EmployeeDesignationRepo repo;

	public EmployeeDesignation save(EmployeeDesignation entity) {
		
		return this.repo.save(entity);
	}
	
	public List<EmployeeDesignation> findAll(){
		
		return this.repo.findAll();
	}
}
