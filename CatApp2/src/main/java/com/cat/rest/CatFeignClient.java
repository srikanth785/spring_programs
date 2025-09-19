package com.cat.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CATAPP1")
public interface CatFeignClient 
{
	@GetMapping("/info")
	public String invokeGetCourseInfo();
}
