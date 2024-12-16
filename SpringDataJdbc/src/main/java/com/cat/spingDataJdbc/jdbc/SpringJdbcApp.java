package com.cat.spingDataJdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbcApp 
{
	private static final String INSERT_QUERY="insert into course(id,cname) values(?,?)";
	private static final String DELETE_QUERY="delete from course where id=?";
	private static final String SELECT_QUERY="select *from course where id=?";
	@Autowired
	private JdbcTemplate springJdbc;
	
	public void insert(CourseInfo course)
	{
		springJdbc.update(INSERT_QUERY,course.getId(),course.getCname());
	}
	public void deleteById(long id)
	{
		springJdbc.update(DELETE_QUERY,id);
	}
	public CourseInfo findById(long id)
	{
		return springJdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(CourseInfo.class),id);
	}
	
}
