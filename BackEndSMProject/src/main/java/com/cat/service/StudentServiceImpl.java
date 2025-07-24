package com.cat.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.model.Student;
import com.cat.repo.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService
{
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return repo.findById(id).orElseThrow(()->new NoSuchElementException("Student not found with id "+id));
	}

	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) 
	{
		repo.deleteById(id);
	}

}
