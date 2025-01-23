package com.cat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExam 
{
	@GetMapping("/wish")
	public ResponseEntity<String> getSomeData()
	{
		String data="Hello Welcome to External server";
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
}
