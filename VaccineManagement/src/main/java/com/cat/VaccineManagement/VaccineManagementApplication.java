package com.cat.VaccineManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Array;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cat.VaccineManagement.entity.VaccineDetails;
import com.cat.VaccineManagement.service.VaccineMngmtService;

@SpringBootApplication
public class VaccineManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(VaccineManagementApplication.class, args);
		
//		VaccineDetails vc=new VaccineDetails();
//		vc.setId(11L);
//		vc.setVaccineName("Covidshiled");
//		vc.setVaccineCompany("Astrazenic");
//		vc.setPrice(123456);
//		
//		VaccineMngmtService vms=context.getBean(VaccineMngmtService.class);
//		System.out.println(vms.registerVaccine(vc));
		
//		VaccineDetails vc1=new VaccineDetails(22L, "covxin", "bharatBio",26000);
//		VaccineDetails vc2=new VaccineDetails(33L, "phizer", "SomeUs",24570);
//		VaccineDetails vc3=new VaccineDetails(44L, "covxin", "someRussia",25000);		
//		List<VaccineDetails> vaccineList=new ArrayList<VaccineDetails>();
//		vaccineList.add(vc1);
//		vaccineList.add(vc2);
//		vaccineList.add(vc3);
//		VaccineMngmtService vms=context.getBean(VaccineMngmtService.class);
//		vms.registerInBatch(vaccineList);
		VaccineMngmtService vms=context.getBean(VaccineMngmtService.class);
		Long count=vms.getVaccineCount();
		System.out.println("Number of vaccines add so far:"+count);
//		
//		Boolean status=vms.checkAvailablity(21L);
//		if(status)
//			System.out.println("Vaccine is available");
//		else
//			System.out.println("Vaccine is not available");
//		vms.fetchAllDetails().forEach(vc->System.out.println(vc));
//		List<Long> idList=new ArrayList<>();
//		idList.add(11L);
//		idList.add(22L);
//		idList.add(44L);
////		ArrayList<VaccineDetails> list=(ArrayList<VaccineDetails>)vms.fetchAllDetailsById(idList);
////		for(VaccineDetails li:list)
////		{
////			System.out.println(li);
////		}
////		vms.fetchAllDetailsById(idList).forEach(vaccine->System.out.println(vaccine));
//		Optional<VaccineDetails> optional= vms.fetchById(4L);
//		Boolean status=optional.isPresent();
//		if(status)
//			System.out.println(optional.get());
//		else
//			optional.orElseThrow(()->new IllegalArgumentException("Records is not present with given id"));
//		String status=vms.removeVaccineById(44L);
//		System.out.println(status);
//		VaccineDetails vc3=new VaccineDetails(32L, "covxin", "someRussia",25000);
//		String status=vms.removeVaccineByOject(vc3);
//		System.out.println(status);
//		List<Long> idList=new ArrayList<>();
//		idList.add(11L);
//		idList.add(33L);
//		String status=vms.removeVaccineByIds(idList);
//		System.out.println(status);
		context.close();
	}

}
