package com.cat.SpringMongoDb.dto;

import lombok.Data;

@Data
public class CustomerDTO 
{
	private Integer cno;
	
	private String name;
	
	private String city;
	
	private float billAmount;
}
