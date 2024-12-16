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
		
		VaccineMngmtService vms=context.getBean(VaccineMngmtService.class);
		vms.fetchingDetails(false, "vaccineName","vaccineCompany").forEach(sortedVaccine->System.out.println(sortedVaccine.getVaccineName()+"==>"+sortedVaccine.getVaccineCompany()));
		//vms.fetchingDetailsByPageNo(2, 3, false, "vaccineName","vaccineCompany").forEach(sortedVaccine->System.out.println(sortedVaccine.getVaccineName()+"==>"+sortedVaccine.getVaccineCompany()));
		vms.fetchDetailsByPagination(3);
		context.close();
	}

}
