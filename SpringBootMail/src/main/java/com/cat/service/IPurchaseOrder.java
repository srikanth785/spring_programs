package com.cat.service;

public interface IPurchaseOrder 
{
	public String purchase(String[] items,double[] prices,String[] toEmail)throws Exception;
}
