package com.java.piet.hod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcCon
{
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/database";
	String user = "root";
	String password = "root";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	public int getid()
	{
		int reg_id = -1;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select max(Registration_Id) from registration");
			while(rs.next())
			{
				reg_id = rs.getInt("max(Registration_Id)");
			}
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{

				if(con!=null)
				{
					con.close();
					con=null;
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		return reg_id;
	}

	public boolean connection(String sr)
	{
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			stmt.execute(sr);
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{

				if(con!=null)
				{
					con.close();
					con=null;
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}

		return true;
	}
}
