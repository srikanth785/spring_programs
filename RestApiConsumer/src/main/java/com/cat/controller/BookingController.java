package com.cat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cat.request.Passenger;
import com.cat.response.Ticket;
import com.cat.service.IBooking;

@Controller
public class BookingController 
{
	@Autowired
	private IBooking booking;
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute("passenger") Passenger passenger,Model model)
	{
		System.out.println(passenger+" in controller");
		Ticket ticket = booking.bookTicket(passenger);
		System.out.println("Ticket in controller after submit "+ticket);
		model.addAttribute("message", "Ticket Number is:"+ticket.getTicketNumber());
		return "index";
	}
	@GetMapping("/form")
	public String loadForm(Model model)
	{
		System.out.println("Controll in form binding url end point");
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	@GetMapping("/ticket")
	public String loadTicketForm(Model model)
	{
		System.out.println("Controll in form binding url end point ticket");
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}
	
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam("ticketNumber")Integer ticketNumber, Model model)
	{
		System.out.println("Controll in form binding url end point ticket get ticket");
		Ticket ticketInfo = booking.getTicketInfoByNum(ticketNumber);
		System.out.println(ticketInfo + " get-ticket controller");
		model.addAttribute("ticket", ticketInfo);
		return "ticket-form";
	}
}
