package com.cat.service;

import com.cat.entity.StockPrice;

public interface IStockPriceService 
{
	public Double fetchByCompanyName(String companyName);
}
