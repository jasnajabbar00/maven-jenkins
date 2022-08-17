package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.repo.EmployeeDetailsRepo;

@Service
public class EmployeeDetailService {

	@Autowired
	private EmployeeDetailsRepo repo;
	
	public EmployeeDetails save(EmployeeDetails entity) {
		
		return this.repo.save(entity);
	}
	
	public List<EmployeeDetails> findAll(){
		
		return this.repo.findAll();
	}
	
//	public String findByEmpDesgId(int empDesignationId) {
//		
//		return this.repo.findByEmpDesgId(empDesignationId);
//	}
}
