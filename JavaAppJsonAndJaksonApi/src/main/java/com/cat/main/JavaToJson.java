package com.cat.main;

import java.util.ArrayList;
import java.util.List;

import com.cat.pojo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		Student s1=new Student();
		s1.setId(101);
		s1.setName("raju");
		s1.setCity("Chennai");
		
		Student s2=new Student();
		s2.setId(102);
		s2.setName("hari");
		s2.setCity("hyd");
		
		List<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		
		ObjectMapper mapper=new ObjectMapper();
		//String str=mapper.writeValueAsString(s);
		//System.out.println(str);
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(l);
		System.out.println(json);
	}
}
