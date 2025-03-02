package com.example.SpringCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringCrud.Repository.SubjectRepository;
import com.example.SpringCrud.entity.Subject;

@Service
public class SubjectService {
   
	@Autowired
	private SubjectRepository subrepo;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjects=new ArrayList<>();
		subrepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public void addSubject(Subject sub) {
		subrepo.save(sub);
	}

	public void updateSubject(int id, Subject sub) {
	    subrepo.save(sub);
		
	}
	
	public void delete(int id) {
		subrepo.deleteById(id);
	}

	
}
