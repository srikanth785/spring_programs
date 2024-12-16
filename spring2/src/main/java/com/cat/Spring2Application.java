package com.cat;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cat.dao.EmployeeDao;
import com.cat.model.Employee1;

@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Spring2Application.class, args);
		//System.out.println("Beans created internally by spring boot"+Arrays.toString(context.getBeanDefinitionNames()));
		EmployeeDao empDao=context.getBean(EmployeeDao.class);
		List<Employee1> l=empDao.getTheEmployee();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
