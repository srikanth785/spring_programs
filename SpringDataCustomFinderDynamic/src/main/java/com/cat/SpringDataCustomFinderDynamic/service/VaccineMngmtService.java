package com.cat.SpringDataCustomFinderDynamic.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.SpringDataCustomFinderDynamic.entity.VaccineRepo;
import com.cat.SpringDataCustomFinderDynamic.type.View;




@Service("vservice")
public class VaccineMngmtService implements IVaccineMngmt 
{
	@Autowired
	private VaccineRepo repo;

	@Override
	public <T extends View> List<T> searchByVaccineCompany(String companyName, Class<T> cls) {
		return repo.findByVaccineCompany(companyName, cls);
	}

	
	
	
}
