package com.cat.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Country;
import com.cat.service.CountryService;

@RestController
public class CountryController 
{
	@Autowired
	private CountryService service;
	
	@PostMapping("/add")
	public String addCountries(@RequestBody Country country)
	{
		return service.addCountry(country);
	}
	
	@GetMapping("/getCountries")
	public Collection getCountries()
	{
		return service.getAllCountries();
	}
}
