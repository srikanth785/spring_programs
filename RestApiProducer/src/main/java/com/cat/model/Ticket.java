package com.cat.model;

import lombok.Data;

@Data
public class Ticket 
{
	private Integer ticketNumber;
	private String status;
	private Double ticketCost;
	private String name;
	private String departure;
	private String arrival;
	private String dateOfJourney;
	private String trainNumber;
}
