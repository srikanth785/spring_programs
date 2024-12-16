package com.cat.SpringDataCustomFinder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringDataCustomFinder.entity.VaccineDetails;
import com.cat.SpringDataCustomFinder.service.VaccineMngmtService;

@SpringBootApplication
public class SpringDataCustomFinderApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context= SpringApplication.run(SpringDataCustomFinderApplication.class, args);
		VaccineMngmtService service=context.getBean(VaccineMngmtService.class);
		//service.fetchVaccineDetailsByCompany("india").forEach(vac->System.out.println(vac));
		//service.fetchVaccineDetailsByPrice(25000).forEach(v->System.out.println(v));
		List<String> li=new ArrayList<>();
		li.add("covxin");
		li.add("Measles");
//		List<VaccineDetails> list=service.fetchVaccineDetailsByVaccinesAndPriceRange(li, 1000, 25500);
//		list.forEach(v->System.out.println(v));
		service.fetchVaccineDetailsNotByName(li).forEach(v->System.out.println(v));
		context.close();
	}

}
