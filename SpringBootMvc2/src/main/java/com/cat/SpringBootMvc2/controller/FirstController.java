package com.cat.SpringBootMvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class FirstController 
{
	@GetMapping("/message1")
	public String someTask1(Model model)
	{
		model.addAttribute("message", "this is our second app from 1st controller task1");
		return "home";
	}
	@GetMapping("/message2")
	public String someTask2(Model model)
	{
		model.addAttribute("message", "this is our second app from 1st controller task2");
		return "home";
	}
}
