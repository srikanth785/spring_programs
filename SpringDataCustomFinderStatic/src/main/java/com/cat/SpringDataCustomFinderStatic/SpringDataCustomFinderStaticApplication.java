package com.cat.SpringDataCustomFinderStatic;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringDataCustomFinderStatic.service.VaccineMngmtService;
import com.cat.SpringDataCustomFinderStatic.type.ResultView;

@SpringBootApplication
public class SpringDataCustomFinderStaticApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataCustomFinderStaticApplication.class, args);
		VaccineMngmtService service=context.getBean(VaccineMngmtService.class);
		List<ResultView> list=service.searchVaccineByStartPrice(25000);
		list.forEach(vac->
		{
			System.out.println(vac.getClass().getName()+"==>"+Arrays.toString(vac.getClass().getDeclaredMethods()));
			System.out.println(vac.getVaccineCompany()+"   "+vac.getVaccineName())	;	
		});
	}

}
