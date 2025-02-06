package com.cat.service;

import com.cat.request.Passenger;
import com.cat.response.Ticket;

public interface IBooking 
{
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicketInfoByNum(Integer ticketNumber);
}
