package com.cat.spingDataJdbc.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface SpringDataJpa extends JpaRepository<CourseInfo, Long> 
{
	List<CourseInfo> findByCname(String cname);
}
 