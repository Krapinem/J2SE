package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
    public static Connection getConnection()
    {
    	String driver="com.mysql.jdbc.Driver"; //1
    	String url ="jdbc:mysql://localhost:3306/med";
    	String user="root";
    	String pass="root";
    	Connection con =null;
    	try
    	{		Class.forName(driver);//2
    		   con  = DriverManager.getConnection(url,user,pass);//3
    	}
    	catch(ClassNotFoundException ex)
    	{
    		ex.printStackTrace();
    		
    	}
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    	return con;
    }
    public static void closeResource(Connection con,Statement stmt)
    {

 		try
 		{
 			  if(stmt!=null)
 			  {
 				  stmt.close();
 				  stmt =null;
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
 				  con =null;
 			  }
 		}
 		catch(SQLException ex)
 		{
 			ex.printStackTrace();
 		}
 		 
 		
    }
}
