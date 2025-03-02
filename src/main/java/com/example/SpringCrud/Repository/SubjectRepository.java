package com.example.SpringCrud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringCrud.entity.Subject;


public interface SubjectRepository extends CrudRepository<Subject,Integer> {
     
}
