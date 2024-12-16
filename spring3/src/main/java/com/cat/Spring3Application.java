package com.cat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.cat.bean.*;
@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Spring3Application.class, args);
		Employee e=(Employee)context.getBean("emp");
		System.out.println(e);
		
	}

}
