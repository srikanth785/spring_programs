package com.cat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Student;
import com.cat.service.StudentService;

@RestController
@RequestMapping("/stu")
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@GetMapping(value="/students")
	public ResponseEntity<List<Student>> getDetails()
	{
		List<Student> stu= service.getAllStudents();
		return new ResponseEntity<List<Student>>(stu,HttpStatus.OK);
	}
}
