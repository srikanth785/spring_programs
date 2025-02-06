package com.cat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.model.Passenger;
import com.cat.model.Ticket;
import com.cat.service.IBooking;

@RestController
@RequestMapping("/api/booking")
public class TouristController 
{
	@Autowired
	private IBooking service;
	
	@PostMapping("/getTicket")
	public ResponseEntity<Ticket> enrollPassenger(@RequestBody Passenger passenger)
	{
		Passenger pas=service.savePassengerInfo(passenger);
		Ticket ticket=new Ticket();
		ticket.setName(pas.getName());
		ticket.setDeparture(pas.getDeparture());
		ticket.setArrival(pas.getArrival());
		ticket.setStatus("Confirmed");
		ticket.setDateOfJourney(pas.getDateOfJourney());
		ticket.setTicketNumber(pas.getPid());
		ticket.setTrainNumber(pas.getTrainNumber());
		ticket.setTicketCost(4525.23);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
		
	}
	@GetMapping("/getTicketInfo/{ticketNumber}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNumber") Integer ticketNumber)
	{
		Passenger pas=service.getPassengerInfo(ticketNumber);
		Ticket ticket=new Ticket();
		ticket.setName(pas.getName());
		ticket.setDeparture(pas.getDeparture());
		ticket.setArrival(pas.getArrival());
		ticket.setStatus("Confirmed");
		ticket.setDateOfJourney(pas.getDateOfJourney());
		ticket.setTicketNumber(pas.getPid());
		ticket.setTrainNumber(pas.getTrainNumber());
		ticket.setTicketCost(4525.23);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
		
	}
}
