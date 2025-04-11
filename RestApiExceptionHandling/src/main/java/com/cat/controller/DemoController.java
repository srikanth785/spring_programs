package com.cat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cat.exception.UserNotFoundException;

@RestController
public class DemoController 
{
	@GetMapping("/wish")
	public String getSomeGoodWishes()
	{
		String wish="I wish you all the best after the course";
		int num=10/0;
		return wish;
	}
	@GetMapping("/get/{id}")
	public String getSomeInfo(@PathVariable("id")Integer id)
	{
		if(id==101)
			return "Siri";
		else if(id==102)
			return "Nani";
		else
			throw new UserNotFoundException("User Not Found with given id");
	}
}
