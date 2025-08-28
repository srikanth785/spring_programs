package com.cat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.entity.StockPrice;

public interface StockRepo extends JpaRepository<StockPrice, Integer> 
{
	public StockPrice findByCompanyName(String companyName);
}
