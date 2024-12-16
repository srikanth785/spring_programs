package com.cat.profiles.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("springboot")
public class SpringBoot implements Courses 
{
	@Override
	public boolean courseRegistered() 
	{
		System.out.println("Spring boot course purchased!");
		return true;
	}

}
