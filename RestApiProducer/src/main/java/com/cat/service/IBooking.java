package com.cat.service;

import com.cat.model.Passenger;

public interface IBooking 
{
	public Passenger savePassengerInfo(Passenger passenger);
	public Passenger getPassengerInfo(Integer pid);
}
