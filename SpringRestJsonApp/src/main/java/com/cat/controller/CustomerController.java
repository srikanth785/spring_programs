package com.cat.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.pojo.Company;
import com.cat.pojo.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController 
{
//	@GetMapping("/report/{id}")
//	public ResponseEntity<Customer> showCustomers(@PathVariable("id") Integer id)
	@GetMapping("/report")
	public ResponseEntity<Customer> showCustomers()
	{
		Customer customer=new Customer();
		customer.setCno(101);
		customer.setCname("virat");
		customer.setBillAmount(54.5f);
		customer.setTeamNames(new String[] {"IND","AUS","PAK","ENG"});
		customer.setStudies(List.of("10th", "12th", "Eng"));
		customer.setCompany(new Company("RCB","IPL","Benguluru",24));
		ResponseEntity<Customer> entity= new ResponseEntity<Customer>(customer, HttpStatus.OK);
		return entity;
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer)
	{
		System.out.println(customer);
		String body="Data Stored successfully!";
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
