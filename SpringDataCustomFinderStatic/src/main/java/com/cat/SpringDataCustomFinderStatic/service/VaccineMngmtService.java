package com.cat.SpringDataCustomFinderStatic.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.SpringDataCustomFinderStatic.entity.VaccineRepo;
import com.cat.SpringDataCustomFinderStatic.type.ResultView;


@Service("vservice")
public class VaccineMngmtService implements IVaccineMngmt 
{
	@Autowired
	private VaccineRepo repo;

	@Override
	public List<ResultView> searchVaccineByStartPrice(Integer price) {
		
		return repo.findByPriceGreaterThanEqualOrderByPrice(price);
	}
	
}
