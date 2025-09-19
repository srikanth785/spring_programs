package com.cat.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Cat2Controller 
{
	@Autowired
	private CatFeignClient feignClient;
	
	@GetMapping("/moreinfo")
	public String getMoreCourseInfo()
	{
//		RestTemplate template=new RestTemplate();
//		ResponseEntity<String> re= template.getForEntity("http://localhost:1990/info", String.class);
//		
//		String apiResponse=re.getBody();
//		return apiResponse+"This course starts on 9th Aug and 7am to 8:30am IST MON_FRI";
		
		String apiResponse=feignClient.invokeGetCourseInfo();
		return apiResponse+"->This course starts on 9th Aug and 7am to 8:30am IST MON_FRI";
	}
}
