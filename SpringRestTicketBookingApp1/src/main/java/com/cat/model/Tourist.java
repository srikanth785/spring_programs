package com.cat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Tourist 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	
	private String name;
	
	private String city;
	
	private String packageType;
	
	private Double budget;
}
