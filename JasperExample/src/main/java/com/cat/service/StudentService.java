package com.cat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.model.Student;
import com.cat.repo.StudentRepo;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepo repo;
	
	public List<Student> getAllStudents()
	{
		System.out.println("data before");
		return repo.findAll();
		
	}
}
