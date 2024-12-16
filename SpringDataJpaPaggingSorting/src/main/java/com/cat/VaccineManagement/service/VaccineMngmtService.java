package com.cat.VaccineManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cat.VaccineManagement.entity.VaccineDetails;
import com.cat.VaccineManagement.entity.VaccineRepo;

@Service("vservice")
public class VaccineMngmtService implements IVaccineMngmt 
{
	@Autowired
	private VaccineRepo repo;

	@Override
	public Iterable<VaccineDetails> fetchingDetails(boolean asc, String... properties) 
	{
		System.out.println("proxy class implementation name for PagingAndSorting interface:"+repo.getClass().getName());
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		Iterable<VaccineDetails> sortedList=repo.findAll(sort);
		return sortedList;
	}

	@Override
	public Iterable<VaccineDetails> fetchingDetailsByPageNo(int pgNo, int pgSize, boolean asc, String... properties) 
	{
		PageRequest pageable=PageRequest.of(pgNo, pgSize, asc?Direction.ASC:Direction.DESC, properties);
		Page<VaccineDetails> page=repo.findAll(pageable);
		return page.getContent();
	}

	@Override
	public void fetchDetailsByPagination(int pgSize) 
	{
		//total records
		long count=6l;
		
		long pagescount=count/pgSize;
		pagescount=count%pgSize==0 ? pagescount : ++pagescount;
		for(int i=0;i<pagescount;i++)
		{
			Pageable pageable=PageRequest.of(i, pgSize);
			Page<VaccineDetails> page=repo.findAll(pageable);
			page.getContent().forEach(vaccine->System.out.println(vaccine));
			System.out.println("****************=>"+(i+1)+" of "+page.getTotalPages());
		}
		
		
	}
	
}
