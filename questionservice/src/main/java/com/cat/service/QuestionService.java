package com.cat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cat.model.Question;
import com.cat.model.QuestionWrapper;
import com.cat.model.Response;
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

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) 
	{
		List<Integer> questions=repo.findRandomQuestionsByCategory(categoryName,numQuestions);
		return new ResponseEntity<>(questions,HttpStatus.OK);		
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionsIds) {
		List<QuestionWrapper> wrappers=new ArrayList<>();
		List<Question> questions=new ArrayList<>();
		
		for(Integer id:questionsIds)
		{
			questions.add(repo.findById(id).get());
		}
		
		for(Question question:questions)
		{
			QuestionWrapper wrapper=new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestionTitle(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			wrappers.add(wrapper);
		}
		return new ResponseEntity<>(wrappers,HttpStatus.OK);
	}

	public ResponseEntity<Integer> getScore(List<Response> responses) 
	{
		int right=0;
		for(Response response:responses)
		{
			Question question=repo.findById(response.getId()).get();
			if(response.getResponse().equals(question.getRightAnswer()))
				right++;
			
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
}
