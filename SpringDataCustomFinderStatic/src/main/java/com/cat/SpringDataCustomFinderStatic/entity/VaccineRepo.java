package com.cat.SpringDataCustomFinderStatic.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cat.SpringDataCustomFinderStatic.type.ResultView;


public interface VaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	public List<ResultView> findByPriceGreaterThanEqualOrderByPrice(Integer price);
}
