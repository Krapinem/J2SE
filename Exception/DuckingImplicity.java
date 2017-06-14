package com.java;

public class DuckingImplicity 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try		//it shift from where the exception occur
		{
		test();
		}
		catch(ArithmeticException ex)		//program will be shifted to the catch and code will run after catch not where the exception occur called Implicit Exception
		{
			ex.printStackTrace();
		}
		System.out.println("Main End");
	}
	static void test()
	{
		System.out.println("Test Start");
		test1();
		System.out.println("Test End");
	}
	static void test1()
	{
		System.out.println("Test1 Start");
				int i =10/0;		
		System.out.println("Test1 End");
	}
}
