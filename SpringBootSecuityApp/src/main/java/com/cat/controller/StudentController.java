package com.cat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.entity.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController 
{
	List<Student> students=new ArrayList<>(List.of(
			new Student(101,"siri","java"),
			new Student(102,"nani","oracle")));
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return students;
	}
	
	@GetMapping("/crf-Token")
	public CsrfToken getCsrfToken(HttpServletRequest req)
	{
		return (CsrfToken) req.getAttribute("_csrf");
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student)
	{
		students.add(student);
	}
}
