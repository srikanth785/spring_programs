package com.cat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Tourist;
import com.cat.service.ITouristManagement;
import com.cat.service.TouristManagementImpl;

@RestController
@RequestMapping("/api/tourist")
public class TouristController 
{
	@Autowired
	private ITouristManagement service;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist toursit)
	{
		try
		{
			System.out.println(toursit);
			String body=service.registerTourist(toursit);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in enrolling Tourist",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/allTouristInfo")
	public ResponseEntity<?> displayTourists(@RequestBody Tourist toursit)
	{
		try
		{
			List<Tourist> list=service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
 			return new ResponseEntity<String>("Problem in fetching tourists data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/touristInfo/{id}")
	public ResponseEntity<?> displayTouristInfo(@PathVariable("id") Integer id)
	{
		try
		{
			Tourist tourist = service.fetchTouristInfoById(id);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
 			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateTouristDetails(@RequestBody Tourist toursit)
	{
		try
		{
			String body=service.updateTouristByDetails(toursit);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		}
		catch(Exception e)
		{
			
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@PatchMapping("/modifyBudget/{id}/{hike}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable("id") Integer id,@PathVariable("hike") Double budgetHike)
	{
		try
		{
			String body=service.updateTouristById(id, budgetHike);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		}
		catch(Exception e)
		{
			
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTouristDetails(@PathVariable("id") Integer id)
	{
		try
		{
			String body=service.deleteTouristById(id);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		}
		catch(Exception e)
		{
			
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}
