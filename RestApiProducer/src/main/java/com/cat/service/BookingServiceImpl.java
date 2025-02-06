package com.cat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.dao.ITouristRepo;
import com.cat.model.Passenger;

@Service
public class BookingServiceImpl implements IBooking
{

	@Autowired
	private ITouristRepo repo;
	
	@Override
	public Passenger savePassengerInfo(Passenger passenger) 
	{
		return repo.save(passenger);
	}

	@Override
	public Passenger getPassengerInfo(Integer pid) {
		Optional<Passenger> optional = repo.findById(pid);
		return optional.get();
	}
	
}
