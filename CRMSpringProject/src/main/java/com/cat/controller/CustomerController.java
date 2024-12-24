package com.cat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.cat.model.CustomerInfo;
import com.cat.service.ICustomerService;

@Controller
public class CustomerController 
{
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/list")
	public String fetchCustomerData(Model model)
	{
		System.out.println("Implementation class of service: "+service.getClass().getName());
		List<CustomerInfo> clist=service.getCustomers();
		clist.forEach(cus->System.out.println(cus));
		model.addAttribute("customers", clist);
		
		return "customerlist";
	}
	@GetMapping("/showform")
	public String showForm(Map<String,Object> model)
	{
		CustomerInfo customer=new CustomerInfo();
		System.out.println("control in show from");
		model.put("customer", customer);
		return "showform";
	}
	
	@GetMapping("/registerCustomer")
	public String registerCustomer(@ModelAttribute("customer")CustomerInfo customer)
	{
		service.registerCustomer(customer);
		//return "registersuccess";
		return "redirect:/list";
	}
	
	@GetMapping("/updateform")
	public String updateCustomer(@RequestParam("customerId")Integer customerId,Map<String,Object> model)
	{
		CustomerInfo customer= service.getCustomer(customerId);
		System.out.println(customer+" in update HM");
		model.put("customer", customer);
		return "showform";
	}
	@GetMapping("/deleteform")
	public String deleteCustomer(@RequestParam("customerId")Integer customerId)
	{
		service.deleteCustomer(customerId);
		return "redirect:/list";
	}
}
