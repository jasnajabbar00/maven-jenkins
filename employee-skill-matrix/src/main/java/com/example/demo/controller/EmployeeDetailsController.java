package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.EmployeeDetailService;

@RestController
@RequestMapping(path="api/v1/details")
public class EmployeeDetailsController {

    @Autowired
	private EmployeeDetailService service;
    
    @PostMapping()
	public EmployeeDetails add(@RequestBody EmployeeDetails entity) {
		
		return this.service.save(entity);
	}
	@GetMapping
	public List<EmployeeDetails> findAll(){
		
		return this.service.findAll();
	}
//	@GetMapping(path="api/v1/{desigId}")
//	@RolesAllowed
//	public EmployeeDetails findByEmpDesgId(@PathVariable("empDesignationId")String empDesignationId) {
//		
//		return this.service.findByEmpDesgId(empDesignationId);
//		
//	}
	
	
}
