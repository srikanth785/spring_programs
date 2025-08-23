package com.cat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.model.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer>
{

}
