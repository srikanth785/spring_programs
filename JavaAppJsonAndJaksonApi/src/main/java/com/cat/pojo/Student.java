package com.cat.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student 
{
	@JsonProperty("Student_id")//optional
	private Integer id;
	
	@JsonProperty("Student_name")//optional
	private String name;
	
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
