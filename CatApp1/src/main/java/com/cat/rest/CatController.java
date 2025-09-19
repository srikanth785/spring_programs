package com.cat.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.service.CatService;

@RestController
public class CatController 
{
	@Autowired
	private CatService service;
	
	@GetMapping("/info")
	public String getCourseInfo()
	{
		return service.courseInfo();
	}
}
