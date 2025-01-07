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

import com.cat.pojo.Employee;


@RestController
public class GreetController 
{
	@GetMapping("employee/{id}")
	public Employee getEmployeeDetails(@PathVariable("id") Integer id)
	{
		Employee e=new Employee();
//		e.setId(101);
//		e.setName("nani");
//		e.setCity("Nellore");
		if(id==101)
		{
			e.setId(101);
			e.setName("nani");
			e.setCity("Nellore");
		}
		else if(id==102)
		{
			e.setId(102);
			e.setName("siva");
			e.setCity("Hyd");
		}
		return e;
	}
}
