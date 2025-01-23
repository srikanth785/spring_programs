package com.cat.service;

import java.util.List;

import com.cat.model.Tourist;

public interface ITouristManagement 
{
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourist();
	public Tourist fetchTouristInfoById(Integer id);
	public String updateTouristByDetails(Tourist tourist);
	public String updateTouristById(Integer id,Double budgetHike);
	public String deleteTouristById(Integer id);
}
