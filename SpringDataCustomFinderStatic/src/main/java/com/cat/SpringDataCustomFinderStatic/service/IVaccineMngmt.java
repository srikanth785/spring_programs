package com.cat.SpringDataCustomFinderStatic.service;

import java.util.List;
import java.util.Optional;

import com.cat.SpringDataCustomFinderStatic.type.ResultView;



public interface IVaccineMngmt 
{
	public List<ResultView> searchVaccineByStartPrice(Integer price);
}
