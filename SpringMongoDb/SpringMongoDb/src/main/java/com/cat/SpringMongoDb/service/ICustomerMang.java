package com.cat.SpringMongoDb.service;

import java.util.List;

import com.cat.SpringMongoDb.dto.CustomerDTO;
import com.cat.SpringMongoDb.entity.Customer;

public interface ICustomerMang 
{
	public String registerCustomer(CustomerDTO dto);
	
	public List<Customer> findAllCustomer();
	
	public String removeCustomer(String id);
	
	public List<Customer> fetchByBillAmountBetween(float start,float stop);
	
	public List<Customer> fetchByCityIn(String ...cities);
}
