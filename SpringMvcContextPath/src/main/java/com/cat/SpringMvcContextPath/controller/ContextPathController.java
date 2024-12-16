package com.cat.SpringMvcContextPath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContextPathController 
{
	@GetMapping("/message")
	public String displaySomeMessage(Model model)
	{
		String message="Welcome to Cat Its Context path app";
		model.addAttribute("message", message);
		return "index";
	}
}
