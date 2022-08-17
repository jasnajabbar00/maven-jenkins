package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.SkillsReference;
import com.example.demo.service.SkillReferenceService;

@RestController
@RequestMapping(path="api/v1/skillReference")
public class SkillsReferenceController {

	   @Autowired
		private SkillReferenceService service;
	    
	    @PostMapping()
		public SkillsReference add(@RequestBody SkillsReference entity) {
			
			return this.service.save(entity);
		}
		@GetMapping
		public List<SkillsReference> findAll(){
			
			return this.service.findAll();
		}
}
