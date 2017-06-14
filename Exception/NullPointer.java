package com.java.ex;
class A
{
	void show()
	{
		System.out.println("Null PointerException");
	}
}
public class NullPointer 
{

	public static void main(String[] args) 
	{
		A a=null; //NullPointException
		try
		{
			if(a==null)
			{
				a.show(); //read as null.show()
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("NPE");
		}
	

	}

}
