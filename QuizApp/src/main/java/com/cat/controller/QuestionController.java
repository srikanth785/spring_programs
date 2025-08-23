package com.cat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Question;
import com.cat.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController 
{
	@Autowired
	private QuestionService service;
	
	@GetMapping("/allQuestions")
	public List<Question> getAllQuestions()
	{
		return service.getAllQuestions();
	}
	
	@GetMapping("/category/{category}")
	public List<Question> getQuestionsByCategory(@PathVariable String category)
	{
		return service.getQuestionsByCategory(category);
	}
	
	@PostMapping("/add")
	public String addQuestion(@RequestBody Question question)
	{
		return service.addQuestion(question);
	}
}
