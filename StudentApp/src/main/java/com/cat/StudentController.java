package com.cat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentRepo repo;
	
	@RequestMapping("/getstudents")
	public List<Student> getStudents()
	{
		return repo.findAll();
	}
	@RequestMapping("/addstudents")
	public void addStudents()
	{
		Student s=new Student();
		s.setName("raj");
		s.setAge(27);
		repo.save(s);
	}
}
