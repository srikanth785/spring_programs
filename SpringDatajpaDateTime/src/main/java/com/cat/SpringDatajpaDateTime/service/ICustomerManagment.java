package com.cat.SpringDatajpaDateTime.service;

import java.util.List;

import com.cat.SpringDatajpaDateTime.entity.Customer;

public interface ICustomerManagment 
{
	public String registerCustomer(Customer c);
	
	public List<Customer> getAllCustomers();
}
