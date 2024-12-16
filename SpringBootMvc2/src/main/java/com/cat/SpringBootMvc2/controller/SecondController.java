package com.cat.SpringBootMvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller2")
public class SecondController 
{
	@GetMapping("/message2-1")
	public String someTask1(Model model)
	{
		model.addAttribute("message", "this is our second app from 2nd controller task1");
		return "home";
	}
	
	@GetMapping("/message2")
	public String someTask2(Model model)
	{
		model.addAttribute("message", "this is our second app from 2nd controller task1");
		return "home";
	}
	@PostMapping("/message2")
	public String someTask3(Model model)
	{
		model.addAttribute("message", "this is our second app from 2nd controller task1");
		return "home";
	}
}
