package com.cat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

}
