package com.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cat.Course;

@Controller
@RequestMapping("/first")
public class CourseController 
{
//	@GetMapping("/courses")
//	public String getCourseDetails(Model model)
//	{
//		model.addAttribute("cid", "T1");
//		model.addAttribute("cname", "RestFull services and Microservices");
//		model.addAttribute("cprice", " 2500 INR");
//		return "course";
//	}
	@GetMapping({"/courseInfo","/courses","/coursedetails"})
	public String getCourseInfo(Model model)
	{
		Course course=new Course();
		course.setCid(44);
		course.setCname("SpringBoot");
		course.setPrice(8000.20);
		course.setCourseDuration("4 Months");
		model.addAttribute("course", course);
		return "courseInfo";
	}
}
