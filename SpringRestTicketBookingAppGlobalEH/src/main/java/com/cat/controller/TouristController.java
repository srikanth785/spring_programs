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
			System.out.println(toursit);
			String body=service.registerTourist(toursit);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		
	}
	
	@GetMapping("/allTouristInfo")
	public ResponseEntity<?> displayTourists(@RequestBody Tourist toursit)
	{
		
			List<Tourist> list=service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/touristInfo/{id}")
	public ResponseEntity<?> displayTouristInfo(@PathVariable("id") Integer id)
	{
			Tourist tourist = service.fetchTouristInfoById(id);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateTouristDetails(@RequestBody Tourist toursit)
	{
			String body=service.updateTouristByDetails(toursit);
			return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	
	@PatchMapping("/modifyBudget/{id}/{hike}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable("id") Integer id,@PathVariable("hike") Double budgetHike)
	{
		
			String body=service.updateTouristById(id, budgetHike);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTouristDetails(@PathVariable("id") Integer id)
	{
		
			String body=service.deleteTouristById(id);
			return new ResponseEntity<String>(body,HttpStatus.OK);
		
	}
}
