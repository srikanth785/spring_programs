package com.cat.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.pojo.Course;

@RestController
public class CourseRestController 
{
	@PostMapping(value="/courseinfo",consumes= {"application/xml","application/json"})
	public ResponseEntity<String> addCourseInfo(@RequestBody Course courseInfo)
	{
		System.out.println(courseInfo);
		//logic to add this in DB
		String msg="Course Info stored in DB";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/courseinfo",produces = {"application/xml","application/json"})
	public Course getCourse()
	{
		//retrive this from DB
		Course course=new Course();
		course.setCid(101);
		course.setCname("Java");
		course.setPrice(6000.23);
		return course;
	}
}
