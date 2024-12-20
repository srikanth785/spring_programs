package com.cat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController 
{
	@GetMapping("/home")
	public String showHome()
	{
		return "home";
	}
	@GetMapping("/response")
	public String showResponse(Map<String, Object> model)
	{
		System.out.println("control in response Handler mapper");
		String[] booksName=new String[] {"java","springboot","python","Hibernate"};
		model.put("books", booksName);
		return "response";
	}
}
