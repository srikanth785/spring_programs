package com.cat.SpringDataCustomFinderDynamic.service;

import java.util.List;
import java.util.Optional;

import com.cat.SpringDataCustomFinderDynamic.type.View;


public interface IVaccineMngmt 
{
	public <T extends View>List<T> searchByVaccineCompany(String companyName, Class<T> cls);
}
