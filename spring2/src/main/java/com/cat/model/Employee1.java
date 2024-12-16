package com.cat.model;

import org.springframework.stereotype.Component;

import com.cat.dao.IEmployeeDao;

@Component
public class Employee1 
{
	private Integer eid;
	private String ename;
	private String address;
	public Employee1()
	{
		System.out.println("Employee obj created");
	}
	
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	public void setEid(Integer eid) 
	{
		this.eid = eid;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	
}
