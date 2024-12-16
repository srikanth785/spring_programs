package com.cat.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cat.service.IGreetings;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class GreetController 
{
	@Autowired
	private IGreetings greeting;
	
//	@GetMapping("/greetings1")
//	public String showResponse(Model model)
//	{
//		model.addAttribute("greet", greeting.generateGreetings());
//		return "greet";
//	}
	
//	@GetMapping("/greetings2")
//	public String showResponse(Map<String,Object> model)
//	{
//		model.put("greet", greeting.generateGreetings());
//		return "greet";
//	}
	
//	@GetMapping("/greetings2")
//	public void showResponse(Map<String,Object> model)
//	{
//		model.put("greet", greeting.generateGreetings());
//		return;
//	}
	@GetMapping("/greetings1")
	public void showResponse(HttpServletResponse response) throws IOException
	{
		String wish=greeting.generateGreetings();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hello from controller it self "+wish+"</h1>");
		return;
	}
}
