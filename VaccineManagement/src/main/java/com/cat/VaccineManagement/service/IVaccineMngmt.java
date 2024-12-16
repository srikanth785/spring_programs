package com.cat.VaccineManagement.service;

import java.util.List;
import java.util.Optional;

import com.cat.VaccineManagement.entity.VaccineDetails;

public interface IVaccineMngmt 
{
	public String registerVaccine(VaccineDetails vaccine);
	public Iterable<VaccineDetails> registerInBatch(Iterable<VaccineDetails> vaccines);
	public Long getVaccineCount();
	public Boolean checkAvailablity(Long id);
	public Iterable<VaccineDetails> fetchAllDetails();
	public Iterable<VaccineDetails> fetchAllDetailsById(List<Long> ids);
	public Optional<VaccineDetails> fetchById(Long id);
	public String removeVaccineById(Long id);
	public String removeVaccineByObject(VaccineDetails obj);
	public String removeVaccineByIds(List<Long> ids);
	
}
