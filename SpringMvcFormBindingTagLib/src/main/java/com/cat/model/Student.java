package com.cat.model;

import lombok.Data;

@Data
public class Student 
{
	private Integer sid;
	private String sname="Rohan";
	private String city="Nellore";
	private Double avgmarks;
	
	public Student()
	{
		System.out.println("Student bean created by DS");
	}
}
