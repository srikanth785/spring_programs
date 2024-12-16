package com.cat.VaccineManagement.entity;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VaccineRepo extends PagingAndSortingRepository<VaccineDetails, Long> 
{

}
