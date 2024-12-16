package com.cat.dao;
import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cat.model.Employee1;

@Repository("empDao")
public class EmployeeDao implements IEmployeeDao
{
	private static final String SQL_QUERY="select * from nani.employee";
	@Autowired
	private DataSource dataSource;
	private List<Employee1> elist=null;
	EmployeeDao()
	{
		System.out.println("Employee dao obj created");
	}
	public List<Employee1> getTheEmployee()
	{
		System.out.println("Data source :"+dataSource.getClass().getName());
		try
		{
			System.out.println("hi");
			Connection con=dataSource.getConnection();
			PreparedStatement ps=con.prepareStatement(SQL_QUERY);
			ResultSet rs=ps.executeQuery();
			elist=new ArrayList<Employee1>();
			while(rs.next())
			{
				Employee1 emp=new Employee1();
				emp.setEid(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setAddress(rs.getString(3));
				elist.add(emp);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return elist;
	}
}
