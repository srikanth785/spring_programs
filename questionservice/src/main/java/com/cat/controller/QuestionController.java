package com.cat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Question;
import com.cat.model.QuestionWrapper;
import com.cat.model.Response;
import com.cat.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController 
{
	@Autowired
	private QuestionService service;
	
	@Autowired
	Environment env;
	
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
	
	@GetMapping("/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName,@RequestParam Integer numQuestions)
	{
		return service.getQuestionsForQuiz(categoryName,numQuestions);
	}
	
	@PostMapping("/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionsIds)
	{
		System.out.println(env.getProperty("local.server.port"));
		return service.getQuestionsFromId(questionsIds);
	}
	
	@PostMapping("getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses)
	{
		return service.getScore(responses);
	}
	//generate
	//getQuestions(questionid)
	//getScore
}
