package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cat.service.PurchaseOrderImpl;

@SpringBootApplication
public class SpringBootMailApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context=SpringApplication.run(SpringBootMailApplication.class, args);
		
		PurchaseOrderImpl service = context.getBean(PurchaseOrderImpl.class);
		
		String msg=service.purchase(new String[] {"java","c++","python"}, 
				new double[] {6000.20,3500.21,6500.10},
				new String[] {"duvvurusushmitha99@gmail.com","k.srikanthreddy785@gmail.com"
				});
		System.out.println(msg);
	}

}
