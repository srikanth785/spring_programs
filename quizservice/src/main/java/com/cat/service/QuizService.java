package com.cat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cat.feign.QuizInterface;
import com.cat.model.QuestionWrapper;
import com.cat.model.Quiz;
import com.cat.model.Response;
import com.cat.repo.QuizRepo;

@Service
public class QuizService 
{
	@Autowired
	private QuizRepo qrepo;
	
	@Autowired
	QuizInterface quizinterf;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) 
	{
		List<Integer> questions=quizinterf.getQuestionsForQuiz(category, numQ).getBody();
		
		Quiz quiz=new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionsIds(questions);
		qrepo.save(quiz);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) 
	{
		Quiz quiz= qrepo.findById(id).get();
		List<Integer> quesionIds=quiz.getQuestionsIds();
		ResponseEntity<List<QuestionWrapper>> questions=quizinterf.getQuestionsFromId(quesionIds);
		return questions;
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) 
	{
		ResponseEntity<Integer> right=quizinterf.getScore(responses);
		return right;
	}
}
