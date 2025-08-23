package com.cat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cat.model.Question;
import com.cat.model.QuestionWrapper;
import com.cat.model.Quiz;
import com.cat.model.Response;
import com.cat.repo.QuestionRepo;
import com.cat.repo.QuizRepo;

@Service
public class QuizService 
{
	@Autowired
	private QuizRepo qrepo;
	
	@Autowired
	private QuestionRepo repo;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) 
	{
		List<Question> questions=repo.findRandomQuestionsByCategory(category,numQ);
		
		Quiz quiz=new Quiz();
		quiz.setTitle(title);
		
		quiz.setQuestions(questions);
		qrepo.save(quiz);
		
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) 
	{
		Optional<Quiz> quiz= qrepo.findById(id);
		List<Question> quesionsFromDB=quiz.get().getQuestions();
		List<QuestionWrapper> questionsForUser=new ArrayList<>();
		
		for(Question q:quesionsFromDB)
		{
			QuestionWrapper qw=new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
			questionsForUser.add(qw);
		}
		return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) 
	{
		Quiz quiz=qrepo.findById(id).get();
		List<Question> questions= quiz.getQuestions();
		int right=0,i=0;
		for(Response response:responses)
		{
			if(response.getResponse().equals(questions.get(i).getRightAnswer()))
				right++;
			i++;
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
}
