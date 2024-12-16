package com.cat.SpringMongoDb.entity;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepo extends MongoRepository<Customer, String> 
{
	public List<Customer> findByBillAmountBetween(float start,float stop);
	
	public List<Customer> findByCityIn(String ...cities);
}
