package com.cat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Passenger 
{
	@Id
	private Integer pid;
	private String name;
	private String departure;
	private String arrival;
	private String dateOfJourney;
	private String trainNumber;
}
