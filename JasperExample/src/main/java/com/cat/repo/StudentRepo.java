package com.cat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	
}
