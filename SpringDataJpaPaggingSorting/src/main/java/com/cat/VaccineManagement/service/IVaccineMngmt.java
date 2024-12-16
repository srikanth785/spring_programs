package com.cat.VaccineManagement.service;

import java.util.List;
import java.util.Optional;

import com.cat.VaccineManagement.entity.VaccineDetails;

public interface IVaccineMngmt 
{
	public Iterable<VaccineDetails> fetchingDetails(boolean asc,String... properties);
	public Iterable<VaccineDetails> fetchingDetailsByPageNo(int pgNo,int pgSize,boolean asc,String... properties);
	public void fetchDetailsByPagination(int pgSize);
}
