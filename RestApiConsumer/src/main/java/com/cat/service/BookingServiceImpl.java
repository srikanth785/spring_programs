package com.cat.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cat.request.Passenger;
import com.cat.response.Ticket;

@Service
public class BookingServiceImpl implements IBooking 
{

	private static final String BOOK_URL = "http://localhost:1990/TicketBookingApp1/api/booking/getTicket";
	private static final String GET_URL = "http://localhost:1990/TicketBookingApp1/api/booking/getTicketInfo/{ticketNumber}";

	@Override
	public Ticket bookTicket(Passenger passenger) 
	{
		System.out.println(passenger+" in service Integration");
		RestTemplate template=new RestTemplate();
		ResponseEntity<Ticket> response = template.postForEntity(BOOK_URL, passenger, Ticket.class);
		return response.getBody();
	}

	@Override
	public Ticket getTicketInfoByNum(Integer ticketNumber) 
	{
		RestTemplate template=new RestTemplate();
		ResponseEntity<Ticket> response = template.getForEntity(GET_URL, Ticket.class, ticketNumber);
		Ticket ticket = response.getBody();
		return ticket;
	}

}
