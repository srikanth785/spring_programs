package com.cat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cat.model.Student;

@Controller
public class RegisterController 
{
	@GetMapping("/studentReg")
	public String responseHome()
	{
		return "register";
	}
	
	@PostMapping("/studentReg")
	public String registerData(Map<String, Object> model,@ModelAttribute("s")Student stu)
	{
		System.out.println(stu);
		model.put("student", stu);
		return "result";
	}
}
