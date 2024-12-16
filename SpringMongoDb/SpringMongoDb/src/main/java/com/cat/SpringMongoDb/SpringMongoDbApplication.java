package com.cat.SpringMongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringMongoDb.dto.CustomerDTO;
import com.cat.SpringMongoDb.service.CustomerMangImpl;

@SpringBootApplication
public class SpringMongoDbApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context= SpringApplication.run(SpringMongoDbApplication.class, args);
		CustomerMangImpl service= context.getBean(CustomerMangImpl.class);
		
//		CustomerDTO dto=new CustomerDTO();
		
//		dto.setCno(888);
//		dto.setName("giri");
//		dto.setCity("nlr");
//		dto.setBillAmount(523.2f);
		//System.out.println(service.registerCustomer(dto));
		//service.findAllCustomer().forEach(c->System.out.println(c));
		//System.out.println(service.removeCustomer("6746ef113f1c551eb563a2b7"));
		//service.fetchByBillAmountBetween(400.1f, 570.2f).forEach(c->System.out.println(c));
		service.fetchByCityIn("nlr","nellore","ong").forEach(c->System.out.println(c));
		
		context.close();
	}

}
