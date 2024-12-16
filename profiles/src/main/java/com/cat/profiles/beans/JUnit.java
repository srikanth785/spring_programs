package com.cat.profiles.beans;

public class JUnit implements Courses 
{
	@Override
	public boolean courseRegistered() 
	{
		System.out.println("JUnit course purchased!");
		return true;
	}

}
