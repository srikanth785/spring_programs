package com.cat.VaccineManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.VaccineManagement.entity.VaccineDetails;
import com.cat.VaccineManagement.entity.VaccineRepo;

@Service("vservice")
public class VaccineMngmtService implements IVaccineMngmt 
{
	@Autowired
	private VaccineRepo repo;
	@Override
	public String registerVaccine(VaccineDetails vaccine) 
	{
		System.out.println("proxy class details:"+repo.getClass().getName());
		if(vaccine!=null)
			repo.save(vaccine);
		return "Vaccine details have been Inserted with vaccine ID:"+vaccine.getId();
	}
	@Override
	public Iterable<VaccineDetails> registerInBatch(Iterable<VaccineDetails> vaccines) 
	{
		return repo.saveAll(vaccines);
	}
	public Long getVaccineCount()
	{
		return repo.count();
	}
	@Override
	public Boolean checkAvailablity(Long id) 
	{
		return repo.existsById(id);
	}
	@Override
	public Iterable<VaccineDetails> fetchAllDetails() 
	{
		return repo.findAll();
	}
	@Override
	public Iterable<VaccineDetails> fetchAllDetailsById(List<Long> ids) 
	{
		return repo.findAllById(ids);
	}
	@Override
	public Optional<VaccineDetails> fetchById(Long id) 
	{
		return repo.findById(id);
	}
	@Override
	public String removeVaccineById(Long id) 
	{
		Optional<VaccineDetails> optional=repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "Deleted successfully "+id;
		}
		else
			return "there is no record with that id: "+id; 
		
	}
	@Override
	public String removeVaccineByObject(VaccineDetails obj) 
	{
		Optional<VaccineDetails> optional=repo.findById(obj.getId());
		if(optional.isPresent())
		{
			repo.deleteById(obj.getId());
			return "Deleted successfully "+obj.getId();
		}
		else
			return "there is no record with that id: "+obj.getId();
	}
	@Override
	public String removeVaccineByIds(List<Long> ids) 
	{
		//repo.deleteAllById(ids);
		Iterable<VaccineDetails> list=repo.findAllById(ids);
		int count=ids.size();
		if(count==((List)list).size())
		{
			repo.deleteAllById(ids);
			return "No of records deleted are: "+count;
		}
		return "Not all records present for the ids given ";
	}
}
