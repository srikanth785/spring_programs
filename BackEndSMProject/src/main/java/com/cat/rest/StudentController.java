package com.cat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Student;
import com.cat.service.IStudentService;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:5173/")
public class StudentController 
{
	@Autowired
	private IStudentService service;
	
	@GetMapping("/Students")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
	}
	
	@PostMapping("/Student")
	public Student registerStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id)
	{
		Student st=service.getStudentById(id);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
		//return ResponseEntity.ok(st);
	}
	
	@PutMapping("/Student/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student student)
	{
		Student st=service.getStudentById(id);
		st.setName(student.getName());
		st.setEmail(student.getEmail());
		st.setAddress(student.getAddress());
		st.setPhoneNumber(student.getPhoneNumber());
		st.setClassName(student.getClassName());
		st.setFathersName(student.getFathersName());
		
		Student updatedData=service.updateStudent(st);
		return new ResponseEntity<Student>(updatedData,HttpStatus.OK);
	}
	
	@DeleteMapping("/Student/{id}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable Long id)
	{
		service.deleteStudentById(id);
		return ResponseEntity.noContent().build();
	}
}
