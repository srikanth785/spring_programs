package com.cat.logging;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtility 
{
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getDbConnection()throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/nani";
		String userName="root";
		String password="catricon@1994";
		return DriverManager.getConnection(url, userName, password);
	}
	public static void closeResource(ResultSet rs,Statement st,Connection con)throws SQLException
	{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}
}
