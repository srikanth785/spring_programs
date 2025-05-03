package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GradleExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleExampleApplication.class, args);
	}
	@GetMapping
	public String getMessage()
	{
		return null;
	}
}
