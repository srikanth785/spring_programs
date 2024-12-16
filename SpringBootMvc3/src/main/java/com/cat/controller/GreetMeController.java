package com.cat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cat.service.Greet;

@Controller
public class GreetMeController 
{
	@Autowired
	private Greet wish;
	
	@RequestMapping("/greet")
	public String greeting(Model model)
	{
		model.addAttribute("wish", wish.greetMe());
		return "home";
	}
}
