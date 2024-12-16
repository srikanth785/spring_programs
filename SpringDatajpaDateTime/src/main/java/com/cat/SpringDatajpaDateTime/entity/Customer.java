package com.cat.SpringDatajpaDateTime.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Customer implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String cname;
	
	private String city;
	
	private LocalDateTime dob;
	
	private LocalTime tor;//time of report
	private LocalDate doj;
	
	public Customer()
	{
		
	}

	public Customer(String cname, String city, LocalDateTime dob, LocalTime tor, LocalDate doj) {
		super();
		this.cname = cname;
		this.city = city;
		this.dob = dob;
		this.tor = tor;
		this.doj = doj;
	}
}
