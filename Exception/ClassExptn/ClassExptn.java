package com.java.NullExcpt;

public class ClassExptn 
{

	public static void main(String[] args) 
	{
		//A a =new A(); //Call Both Static And Constructor
		try
		{
			Class.forName("com.java.NullExcpt.A");			//Class is used inside try catch block and It only Allow to Run Static Block only
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Class Not Found");
		}
	}

}
