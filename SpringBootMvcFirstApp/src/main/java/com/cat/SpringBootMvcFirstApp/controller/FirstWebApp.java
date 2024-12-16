package com.cat.SpringBootMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstWebApp 
{
	@RequestMapping("/cat")
	public ModelAndView displayMessage()
	{
		ModelAndView mav=new ModelAndView();		
		mav.addObject("message", "This is my first cat web app");
		
		mav.setViewName("index");
		
		return mav;
	}
	@GetMapping("/springweb")
	public ModelAndView displayDiffMessage()
	{
		ModelAndView mav=new ModelAndView();		
		mav.addObject("message", "This is my first spring web app");
		
		mav.setViewName("index");
		
		return mav;
	}
	@GetMapping("/spring")
	public String displayDiffMessage(Model model)
	{
		model.addAttribute("message", "This is also spring web app but in diff way");
		return "index";
	}
}
