package com.cat.profiles.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mydbconnector.properties")
public class MyConfiguration 
{
	@Bean
	public MyDbConnect connect(@Value("${mydbconnector.username}")String username,@Value("${mydbconnector.password}")String password)
	{
		System.out.println("MyDbCustomized obj");
		MyDbConnect db=new MyDbConnect();
		System.out.println(username);
		System.out.println(password);
		System.out.println("===================================");
		System.out.println("DB user: "+db.getUsername()+" password "+db.getPassword());
		return db;
	}
}
