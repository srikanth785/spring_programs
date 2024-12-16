package com.cat.VaccineManagement.entity;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface VaccineRepo extends CrudRepository<VaccineDetails, Long> {

}
