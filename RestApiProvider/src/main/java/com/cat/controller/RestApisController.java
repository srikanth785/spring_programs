package com.cat.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Springer;

@RestController
@RequestMapping("/api")
public class RestApisController 
{
	@GetMapping("/greet")
	public ResponseEntity<String> displayWishMessage()
	{
		LocalDateTime dateTime=LocalDateTime.now();
		int hour=dateTime.getHour();
		String body=null;
		String user="Virat";
		
		if(hour<12)
			body="Good Morning:: "+user;
		else if(hour<16)
			body="Good Afternoon:: "+user;
		else if(hour<20)
			body="Good Evening:: "+user;
		else
			body="Good Night:: "+user;
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	@GetMapping("/getinfo/{id}/{name}")
	public ResponseEntity<String> getSomeData(@PathVariable("id") Integer id,@PathVariable("name") String name)
	{
		LocalDateTime dateTime=LocalDateTime.now();
		int hour=dateTime.getHour();
		String body=null;
		
		
		if(hour<12)
			body="Good Morning:: "+name+" id is "+id;
		else if(hour<16)
			body="Good Afternoon:: "+name+" id is "+id;
		else if(hour<20)
			body="Good Evening:: "+name+" id is "+id;
		else
			body="Good Night:: "+name+" id is "+id;
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerSpringer(@RequestBody Springer springer)
	{
		System.out.println("Control in register springer");
		String body="Hello! "+springer.getName();
		return new ResponseEntity<String>(body, HttpStatus.CREATED);
	}
	
	@GetMapping("/getjson")
	public ResponseEntity<Springer> getSpringer()
	{
		Springer sp=new Springer();
		sp.setId(1);
		sp.setName("Rahul");
		sp.setCity("Nellore");
		return new ResponseEntity<Springer>(sp, HttpStatus.OK);
	}
}
