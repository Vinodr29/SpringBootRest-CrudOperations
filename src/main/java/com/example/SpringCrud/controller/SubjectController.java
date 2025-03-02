package com.example.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCrud.entity.Subject;
import com.example.SpringCrud.service.SubjectService;

@RestController
public class SubjectController {
    @Autowired
	private SubjectService subservice;
	
    @RequestMapping("/subjects/")
    public List<Subject> getAllSubjects(){
		return subservice.getAllSubjects();
	}
    
    @RequestMapping(method =RequestMethod.POST,value="/subjects/")
    public void addSubject(@RequestBody Subject sub) {
    	 subservice.addSubject(sub);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/subjects/{id}")
    public void updateSubject(@PathVariable int id,@RequestBody Subject sub) {
    	subservice.updateSubject(id,sub);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/subjects/{id}")
    public void delete(@PathVariable int id) {
    	subservice.delete(id);
    }
    
}
