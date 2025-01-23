package com.cat.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceConsumerJson implements CommandLineRunner 
{

	@Override
	public void run(String... args) throws Exception 
	{
		RestTemplate template = new RestTemplate();
		String url="http://localhost:1990/api/getjson";
		ResponseEntity<Springer> response = template.getForEntity(url, Springer.class);
		System.out.println("Response Body:"+response.getBody());
		System.out.println("Response Statuscode:"+response.getStatusCode());
		System.out.println("Response Statuscode to String:"+response.getStatusCode().toString());
		
		System.out.println("********************************************");
	}

}
