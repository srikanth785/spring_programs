package com.cat.consumer;


import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceConsumerPostRegister implements CommandLineRunner 
{

	@Override
	public void run(String... args) throws Exception 
	{
		RestTemplate template = new RestTemplate();
		
		
		String url="http://localhost:1990/api/register";
		
		//Sending the JSon data into @RequestBody Springer api
		
		HttpHeaders headers=new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		String json_body="{\r\n"
				+ "    \"id\":\"5\",\r\n"
				+ "    \"name\":\"siva\",\r\n"
				+ "    \"city\":\"nellore\"\r\n"
				+ "    \r\n"
				+ "}";
		
		HttpEntity httpEntity=new HttpEntity(json_body,headers);
		System.out.println("***************************************");
		ResponseEntity<String> response = template.postForEntity(url, httpEntity,String.class);
		System.out.println("Response Body:"+response.getBody());
		System.out.println("Response Statuscode:"+response.getStatusCode());
	
	}

}