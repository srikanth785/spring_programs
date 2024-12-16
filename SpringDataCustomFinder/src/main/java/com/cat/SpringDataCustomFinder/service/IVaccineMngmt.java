package com.cat.SpringDataCustomFinder.service;

import java.util.List;
import java.util.Optional;

import com.cat.SpringDataCustomFinder.entity.VaccineDetails;



public interface IVaccineMngmt 
{
	public List<VaccineDetails> fetchVaccineDetailsByCompany(String companyName);
	public List<VaccineDetails> fetchVaccineDetailsByPrice(Integer price);
	public List<VaccineDetails> fetchVaccineDetailsByVaccinesAndPriceRange(List<String> vaccines,Integer startRange,Integer endRange);
	public List<VaccineDetails> fetchVaccineDetailsNotByName(List<String> vaccines);
}
