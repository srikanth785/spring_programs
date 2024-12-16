package com.cat.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.cat.profiles.beans.Courses;
import com.cat.profiles.beans.JUnit;
import com.cat.profiles.beans.MyConfiguration;
import com.cat.profiles.beans.MyDbConnect;


@SpringBootApplication
public class ProfilesApplication implements CommandLineRunner
{ 
	@Autowired
	private Courses course;
	
	@Value("${myproject.name}")
	private String projectname;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(ProfilesApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Run method");
		System.out.println("My projectname:"+projectname);
		boolean status=course.courseRegistered();
		System.out.println(status);
		
	}
	
	@Profile("junit")
	@Bean
	public JUnit junitObj()
	{
		System.out.println("Junit obj");
		return new JUnit();
	}

}
