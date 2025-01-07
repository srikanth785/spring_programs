package com.cat.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping("/greet")
@RestController
public class GreetController 
{
	@GetMapping("/message")
	public String generateSomeMessage()
	{
		String msg="Welcome to Cat Spring REST classes";
		return msg;
	}
	@GetMapping("/wish")
	public String generateSomeWish()
	{
		String msg="warm wishes to all spring boot developers";
		return msg;
	}
	@GetMapping("/course")
	public String generateCourseDetails(@RequestParam(value="name",
	required = false,defaultValue = "Alien")String name)
	{
		String msg="Hello!"+name+" please visit cat For new courses";
		return msg;
	}
	@GetMapping("/advcourse/{name}")
	public String generateAdvCourseDetails(@PathVariable("name") String name)
	{
		String msg="Hello!"+name+" please visit cat For new courses";
		return msg;
	}
//	public ResponseEntity generateGreeting()
//	{
//		LocalDateTime dateTime=LocalDateTime.now();
//		int hour=dateTime.getHour();
//		String body=null;
//		
//		if(hour<12)
//			body="Good Morning";
//		else if(hour<16)
//			body="Good Afternoon";
//		else if(hour<20)
//			body="Good Evening";
//		else
//			body="Good Night";
//		ResponseEntity<String> responseBody=new ResponseEntity<>(body,HttpStatus.OK);
//		return responseBody;
//	}
}
