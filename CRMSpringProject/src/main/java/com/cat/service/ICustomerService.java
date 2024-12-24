package com.cat.service;

import java.util.List;
import java.util.Optional;

import com.cat.model.CustomerInfo;

public interface ICustomerService 
{
	public List<CustomerInfo> getCustomers();
	public void registerCustomer(CustomerInfo customer);
	public CustomerInfo getCustomer(Integer id);
	public void deleteCustomer(Integer id);
}
