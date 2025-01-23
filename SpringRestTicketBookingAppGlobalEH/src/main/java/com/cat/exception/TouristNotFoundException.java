package com.cat.exception;

public class TouristNotFoundException extends RuntimeException
{
	public TouristNotFoundException(String message)
	{
		super(message);
	}
}
