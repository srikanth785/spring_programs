package com.cat.SpringDataJpa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringDataJpa1.entity.Employee;
import com.cat.SpringDataJpa1.entity.EmployeeDetail;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpa1Application.class, args);
		EmployeeDetail empRepo=context.getBean(EmployeeDetail.class);
		System.out.println("Implementing class details:"+empRepo.getClass().getName());
		
		Employee e=new Employee();
		
		e.setId(121);
		e.setEname("srikanth");
		e.setEaddress("Penubarthi");
		e.setEsalary(15000);
		
		empRepo.save(e);
		System.out.println("Data inserted");
		
		
	}

}
