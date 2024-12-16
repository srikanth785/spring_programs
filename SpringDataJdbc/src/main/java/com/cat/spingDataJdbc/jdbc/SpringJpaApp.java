package com.cat.spingDataJdbc.jdbc;


import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SpringJpaApp
{
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(CourseInfo course)
	{
		System.out.println("Insertion through jpa");
		entityManager.merge(course);	
		System.out.println("in completed");
	}
	public CourseInfo findById(long id)
	{
		return entityManager.find(CourseInfo.class, id);
	}
	public void deleteById(long id)
	{
		CourseInfo info=entityManager.find(CourseInfo.class, id);
		entityManager.remove(info);
	}
}
