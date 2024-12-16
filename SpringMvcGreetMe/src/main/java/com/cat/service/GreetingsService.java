package com.cat.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingsService implements IGreetings 
{

	@Override
	public String generateGreetings() 
	{
		LocalDateTime dateTime=LocalDateTime.now();
		int hour=dateTime.getHour();
		if(hour<12)
			return "Good Morning! Have a great Day";
		else if(hour<16)
			return "Good Afternoon! Have a great Noon";
		else if(hour<20)
			return "Good Evening! Have a great Evening";
		else
			return "Good Night! Sleep well";
	}

}
