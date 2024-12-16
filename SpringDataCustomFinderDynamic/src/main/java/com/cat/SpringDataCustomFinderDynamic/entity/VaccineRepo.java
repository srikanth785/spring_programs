package com.cat.SpringDataCustomFinderDynamic.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.SpringDataCustomFinderDynamic.type.View;


public interface VaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	public <T extends View>List<T> findByVaccineCompany(String companyName, Class<T> cls);
}
