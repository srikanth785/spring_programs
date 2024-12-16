package com.cat.SpringDatajpaDateTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.SpringDatajpaDateTime.entity.Customer;
import com.cat.SpringDatajpaDateTime.entity.IcustomerReo;

@Service
public class CustomerManagmentImpl implements ICustomerManagment
{

	@Autowired
	private IcustomerReo repo;
	
	@Override
	public String registerCustomer(Customer c) 
	{
		Integer id=repo.save(c).getId();
		return "Data inserted successfully for Id:"+id;
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		return (List<Customer>) repo.findAll();
	}
	
}
