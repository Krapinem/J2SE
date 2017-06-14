package com.java;

public class TryCatchWidReturn 
{
	public static void main(String[] args) 
	{
		System.out.println(test(19));
	}
	static int test(int i)
	{
		try
		{
			int j = i/(i-9);
			 return j;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Divide By Zero");
			// return 0;
		}
		finally
		{
			System.out.println("Finally");
			// return 10;
		}
		return 11;
	}

}
