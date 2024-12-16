package com.cat.logging;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;

public class LaunchJDBC 
{
	private static final Logger logger=Logger.getLogger(LaunchJDBC.class);
	static
	{
		PropertyConfigurator.configure("src\\main\\java\\com\\cat\\configs\\log4j.properties");
//		SimpleLayout layout=new SimpleLayout();
//		ConsoleAppender cAppender=new ConsoleAppender(layout);
//		logger.addAppender(cAppender);
//		logger.setLevel(Level.DEBUG);
	}
	public static void main(String[] args) 
	{
		logger.debug("start of main method");
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Scanner sc=null;
		
		try
		{
			logger.info("Driver registered successfully!");
			con=JdbcUtility.getDbConnection();
			
			logger.info("Establised connection!");
			
			if(con!=null)
			{
				String query="select id,cname from course where id=?";
				ps=con.prepareStatement(query);
				logger.debug("statement obj created");
			}
			if(ps!=null)
			{
				sc=new Scanner(System.in);
				System.out.println("Kindly enter the id");
				Integer id=sc.nextInt();
				ps.setInt(1, id);
				rs=ps.executeQuery();
			}
			if(rs!=null)
			{
				if(rs.next())
				{
					System.out.println("id\tcname");
					System.out.println(rs.getInt("id")+"\t"+rs.getString("cname"));
				}
				else
				{
					System.out.println("Records are not available for this id");
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			logger.error("SQLException is generated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.fatal("Exception is generated unknown");
		}
		finally 
		{
			try
			{
				JdbcUtility.closeResource(rs, ps, con);
				sc.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				logger.error("SQLException is generated");
			}
		}
	}
}
