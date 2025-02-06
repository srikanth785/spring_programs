package com.cat.request;



import lombok.Data;

@Data
public class Passenger 
{
	private Integer pid;
	private String name;
	private String departure;
	private String arrival;
	private String dateOfJourney;
	private String trainNumber;
}
