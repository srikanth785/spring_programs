package com.cat.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Greetings implements Greet {

	@Override
	public String greetMe() 
	{
		LocalDateTime dateTime=LocalDateTime.now();
		int hour=dateTime.getHour();
		
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
	}

}
