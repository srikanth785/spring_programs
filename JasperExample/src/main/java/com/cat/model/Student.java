package com.cat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student 
{
	@Id
	private Integer sno;
	private String sname;
	private Integer age;
	private Integer marks;
}
