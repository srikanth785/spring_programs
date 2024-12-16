package com.cat.spingDataJdbc.jdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="course")
public class CourseInfo 
{
	@Id
	private Integer id;
	
	@Column(name="cname")
	private String cname;
	
	
	public CourseInfo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public CourseInfo(Integer id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "CourseInfo [id=" + id + ", cname=" + cname + "]";
	}
	
}
