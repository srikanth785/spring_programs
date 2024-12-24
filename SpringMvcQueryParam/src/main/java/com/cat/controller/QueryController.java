package com.cat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController 
{
	//localhost:1990/message?name=srikanth&course=java
	@GetMapping("/message")
	public String displaySomeMessage(@RequestParam("name")String name,@RequestParam("course")String course, Model model)
	{
		System.out.println(name+" Controller");
		String msg="Hello! Welcome to this App "+name+" I hope you're learning "+course+" and enjoying the course";
		//model.put("message", msg);
		model.addAttribute("message", msg);
		return "index";
	}
}
