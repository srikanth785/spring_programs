package com.cat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.dao.ITouristRepo;
import com.cat.exception.TouristNotFoundException;
import com.cat.model.Tourist;

@Service
public class TouristManagementImpl implements ITouristManagement 
{
	@Autowired
	private ITouristRepo repo;

	@Override
	public String registerTourist(Tourist tourist) 
	{
		Tourist tour= repo.save(tourist);
		return "Tourist registered with id : "+tour.getTid();
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		
		return repo.findAll();
	}

	@Override
	public Tourist fetchTouristInfoById(Integer id) 
	{
		return repo.findById(id).orElseThrow(()->new 
				TouristNotFoundException("Tourist with id "+id+" not found"));
	}

	@Override
	public String updateTouristByDetails(Tourist tourist) 
	{
		Optional<Tourist> optional=repo.findById(tourist.getTid());
		if(optional.isPresent())
		{
			repo.save(tourist);
			return "Tourist with id "+tourist.getTid()+" is updated";
		}
		else
		{
			throw new TouristNotFoundException("Tourist with id "+tourist.getTid()+" is not available for updating");
		}
	}

	@Override
	public String updateTouristById(Integer id, Double budgetHike) 
	{	
		Optional<Tourist> optional=repo.findById(id);
		if(optional.isPresent())
		{
			Tourist tourist = optional.get();
			tourist.setBudget(budgetHike);
			repo.save(tourist);
			return "Tourist with id "+tourist.getTid()+" is updated";
		}
		else
		{
			throw new TouristNotFoundException("Tourist with id "+id+" is not available for updating");
		}
	}

	@Override
	public String deleteTouristById(Integer id) 
	{
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "Tourist with id "+id+" is Deleted";
		}
		else
		{
			throw new TouristNotFoundException("Tourist with id "+id+" is not available for delete");
		}
	}
}
