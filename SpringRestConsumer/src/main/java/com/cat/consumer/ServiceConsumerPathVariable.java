package com.cat.consumer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceConsumerPathVariable implements CommandLineRunner 
{

	@Override
	public void run(String... args) throws Exception 
	{
		RestTemplate template = new RestTemplate();
		Map<String, Object> map=new HashMap<>();
		map.put("id", 5);
		map.put("name", "kumar");
		String url="http://localhost:1990/api/getinfo/{id}/{name}";
		System.out.println("***************************************");
		ResponseEntity<String> response = template.getForEntity(url, String.class,map);
		System.out.println("Response Body:"+response.getBody());
		System.out.println("Response Statuscode:"+response.getStatusCode());
		System.out.println("Response Statuscode to String:"+response.getStatusCode().toString());
	}

}
