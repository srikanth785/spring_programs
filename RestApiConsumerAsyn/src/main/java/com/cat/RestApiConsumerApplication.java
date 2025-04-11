package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.cat.response.Ticket;

@SpringBootApplication
public class RestApiConsumerApplication 
{
	private static final String GET_URL = "http://localhost:1990/TicketBookingApp1/api/booking/"
			+ "getTicketInfo/{ticketNumber}";
	
	public static void main(String[] args) 
	{
		SpringApplication.run(RestApiConsumerApplication.class, args);
		
		System.out.println("Request Sending started");
		WebClient webClient=WebClient.create();
		String response = webClient.get().
		//webClient.get().
		uri(GET_URL,101).
		retrieve().
		bodyToMono(String.class).//subscribe(RestApiConsumerApplication::handleResponse);//Async
		block();
		System.out.println(response);
		System.out.println("Request Sending ended.......");
				
	}
	public static void handleResponse(String response)
	{
		System.out.println(response);
	}

}
