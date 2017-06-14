package com.java;

public class DuckingExplicit
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try
		{
		test();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Main End");
	}
	static void test() throws ClassNotFoundException
	{
		System.out.println("Test Start");
		test1();
		System.out.println("Test End");
	}
	static void test1() throws ClassNotFoundException
	{
		System.out.println("Test1 Start");
		//try
		//{
			Class.forName("");	
		//}
		//catch(ClassNotFoundException ex)
		//{
			//System.out.println("Class Not Found");
			//ex.printStackTrace();
		//}
			System.out.println("Test1 End");
	}

}
