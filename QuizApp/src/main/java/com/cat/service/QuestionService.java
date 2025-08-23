package com.cat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.model.Question;
import com.cat.repo.QuestionRepo;

@Service
public class QuestionService
{
	@Autowired
	private QuestionRepo repo;
	
	public List<Question> getAllQuestions()
	{
		return repo.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		
		return repo.findByCategory(category);
	}

	public String addQuestion(Question question) {
		repo.save(question);
		return "success";
	}
}
