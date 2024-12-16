package com.cat.SpringDataJpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringDataJpa2.entity.Employee;
import com.cat.SpringDataJpa2.entity.EmployeeDetail;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpa2Application.class, args);

		EmployeeDetail empRepo=context.getBean(EmployeeDetail.class);
		System.out.println("Implementing class details:"+empRepo.getClass().getName());
		Employee e=new Employee();
		e.setId(2);
		e.setEname("siri");
		e.setEaddress("VRC");
		e.setEsalary(45000);
		empRepo.save(e);
		System.out.println("Data inserted successfully");
		context.close();
		
	}

}
