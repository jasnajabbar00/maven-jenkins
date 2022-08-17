package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.EmployeeDesignationService;
import com.example.demo.service.EmployeeDetailService;

@RestController
@RequestMapping(path="api/v1/designation")
public class EmployeeDesignationController {

	   @Autowired
		private EmployeeDesignationService service;
	    
	    @PostMapping()
		public EmployeeDesignation add(@RequestBody EmployeeDesignation entity) {
			
			return this.service.save(entity);
		}
		@GetMapping
		public List<EmployeeDesignation> findAll(){
			
			return this.service.findAll();
		}
}
