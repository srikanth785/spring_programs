package com.cat.SpringMongoDb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.SpringMongoDb.dto.CustomerDTO;
import com.cat.SpringMongoDb.entity.Customer;
import com.cat.SpringMongoDb.entity.ICustomerRepo;
import com.cat.SpringMongoDb.generator.IdGenerator;

@Service
public class CustomerMangImpl implements ICustomerMang
{

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String registerCustomer(CustomerDTO dto) 
	{
		System.out.println("Imp class name for Mongo Repo:"+repo.getClass().getName());
		Customer document=new Customer();
		document.setId(IdGenerator.generateID());
		BeanUtils.copyProperties(dto, document);
		
		Customer doc=repo.save(document);		
		return "Data inserted with id:"+doc.getId();
	}

	@Override
	public List<Customer> findAllCustomer() 
	{
		return repo.findAll();
	}

	@Override
	public String removeCustomer(String id) 
	{
		Optional<Customer> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.delete(optional.get());
			return "Customer removed";
		}
		return "Customer doc not found";
	}

	@Override
	public List<Customer> fetchByBillAmountBetween(float start, float stop) {
		
		return repo.findByBillAmountBetween(start, stop);
	}

	@Override
	public List<Customer> fetchByCityIn(String... cities) 
	{
		return repo.findByCityIn(cities);
	}

}
