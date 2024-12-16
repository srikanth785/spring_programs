package com.cat.SpringDatajpaDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringDatajpaDateTime.entity.Customer;
import com.cat.SpringDatajpaDateTime.service.CustomerManagmentImpl;

@SpringBootApplication
public class SpringDatajpaDateTimeApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context= SpringApplication.run(SpringDatajpaDateTimeApplication.class, args);
		
		CustomerManagmentImpl manage=context.getBean(CustomerManagmentImpl.class);
		
		Customer customer= new	Customer(1,"siri","Hyd",LocalDateTime.of(2024, 3, 8,11,15,0),LocalTime.of(12, 1),LocalDate.now());
		System.out.println(manage.registerCustomer(customer));
		//manage.getAllCustomers().forEach(cd->System.out.println(cd));
		context.close();
	}

}
