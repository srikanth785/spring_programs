package com.cat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.entity.StockPrice;
import com.cat.exception.StockNotfoundException;
import com.cat.repo.StockRepo;

@Service
public class StockServiceImpl implements IStockPriceService 
{
	@Autowired
	private StockRepo repo;
	
	@Override
	public Double fetchByCompanyName(String companyName) 
	{
		StockPrice sp=repo.findByCompanyName(companyName);	
		if(sp==null)
		{
			throw new StockNotfoundException("Stock price not available for the given Company");
		}
		return sp.getCompanyPrice();
	}

}
