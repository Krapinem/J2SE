package com.java;

class A
{
	
}
class B extends A
{
	
}
public class ClassCastExcptn 
{

	public static void main(String[] args) 
	{
		B a = (B)new A(); //ClassCastException
	}

}
