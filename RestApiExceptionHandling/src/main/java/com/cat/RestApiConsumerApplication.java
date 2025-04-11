package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;



@SpringBootApplication
public class RestApiConsumerApplication 
{
	
	
	public static void main(String[] args) 
	{
		SpringApplication.run(RestApiConsumerApplication.class, args);
		
	}

}
