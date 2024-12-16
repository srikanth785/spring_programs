package com.cat.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee 
{
	@Value("${info.employee.name}")
	private String name;
	
	@Value("${info.employee.age}")
	private int age;
	
	@Value("${info.employee.city}")
	private String city;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
}
