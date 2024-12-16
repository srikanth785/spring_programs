package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bean.Employee;

@SpringBootApplication
public class SpringBoot4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot4Application.class, args);
	Employee e=(Employee) context.getBean("emp");
	System.out.println(e);
	
	}

}
