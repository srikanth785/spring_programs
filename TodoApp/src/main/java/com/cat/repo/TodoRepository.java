package com.cat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> 
{

}
