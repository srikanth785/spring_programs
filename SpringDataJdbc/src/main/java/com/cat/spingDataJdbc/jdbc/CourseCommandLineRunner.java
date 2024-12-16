package com.cat.spingDataJdbc.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner 
{

//	@Autowired
//	private SpringJdbcApp app;
	
//	@Autowired
//	private SpringJpaApp app;
	
	@Autowired
	private SpringDataJpa app;
	
	@Override
	public void run(String... args) throws Exception 
	{
//		app.insert(new CourseInfo(2,"c++"));
//		app.insert(new CourseInfo(3,"python"));
//		app.insert(new CourseInfo(4,"c-lang"));
//		app.save(new CourseInfo(10,".net"));
//		app.save(new CourseInfo(11,"html"));
//		app.save(new CourseInfo(12,"react"));
		
//		app.deleteById(2l);
//		System.out.println(app.findById(10l));
//		System.out.println(app.findById(12l));
		System.out.println(app.findByCname("react"));
	}
}
