package com.cat.SpringMongoDb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Document
public class Customer 
{
	@Id
	private String id;
	
	private Integer cno;
	
	private String name;
	
	private String city;
	
	private float billAmount;
}
