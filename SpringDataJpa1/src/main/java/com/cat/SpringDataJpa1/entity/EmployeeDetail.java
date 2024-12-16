package com.cat.SpringDataJpa1.entity;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDetail extends CrudRepository<Employee, Serializable> {

}
