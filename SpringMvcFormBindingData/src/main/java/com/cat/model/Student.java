package com.cat.model;

import lombok.Data;

@Data
public class Student 
{
	private Integer sid;
	private String sname;
	private String city;
	private Double avgmarks;
	
	public Student()
	{
		System.out.println("Student bean created by DS");
	}
}
