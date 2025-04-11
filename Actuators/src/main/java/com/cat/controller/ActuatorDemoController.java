package com.cat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorDemoController 
{
	@GetMapping("/")
	public String someWish()
	{
		return "Microservices course will be live in cat";
	}
}
