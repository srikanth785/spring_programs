package com.cat.model;

public class Springer 
{
	private Integer id;
	private String name;
	private String city;
	@Override
	public String toString() {
		return "Springer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
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
	public Springer() 
	{
		super();
	}
	
	
}
