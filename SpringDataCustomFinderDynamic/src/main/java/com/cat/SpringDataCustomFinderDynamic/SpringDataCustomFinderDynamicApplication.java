package com.cat.SpringDataCustomFinderDynamic;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.SpringDataCustomFinderDynamic.service.VaccineMngmtService;
import com.cat.SpringDataCustomFinderDynamic.type.*;



@SpringBootApplication
public class SpringDataCustomFinderDynamicApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataCustomFinderDynamicApplication.class, args);
		VaccineMngmtService service=context.getBean(VaccineMngmtService.class);
//		List<ResultView1> list1=service.searchByVaccineCompany("United Kingdom", ResultView1.class);
//		
//		list1.forEach(vac->{
//			System.out.println(vac.getId()+":"+vac.getVaccineName()+":"+vac.getPrice());
//		});
//		List<ResultView2> list2=service.searchByVaccineCompany("someRussia", ResultView2.class);
//		
//		list2.forEach(vac->{
//			System.out.println(vac.getVaccineName()+":"+vac.getVaccineCompany());
//		});
//		List<ResultView3> list3=service.searchByVaccineCompany("india", ResultView3.class);
//		
//		list3.forEach(vac->{
//			System.out.println(vac.getPrice());
//		});
		context.close();
	}

}
