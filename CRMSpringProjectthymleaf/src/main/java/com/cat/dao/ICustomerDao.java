package com.cat.dao;

import org.springframework.data.repository.CrudRepository;

import com.cat.model.CustomerInfo;

public interface ICustomerDao extends CrudRepository<CustomerInfo, Integer> 
{

}
