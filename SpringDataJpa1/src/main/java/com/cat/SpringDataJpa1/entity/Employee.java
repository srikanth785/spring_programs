package com.cat.SpringDataJpa1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee 
{
	@Id
	private Integer id;
	
	@Column
	private String ename;
	
	private String eaddress;
	
	private Integer esalary;
}
