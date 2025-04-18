package com.cat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Health 
{
	@Id
	private Integer id;
	
	private Integer duration;
	
	private Integer pulse;
	
	private Integer maxPulse;
	
	private Double calories;
	
}
