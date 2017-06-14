package com.java;

class Person /*extends Object*/
{
	int age;
	float weight;
	double height;
	public Person(int age, float weight, double height) 
	{
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String toString()
	{
		return "Age="+age+" Weight="+weight+" height="+height;
	}
	public boolean equals(Object obj)
	{
		Person p2 = (Person)obj; //this = p1    & object = p2	//downcast is done	we can assign the obj of derived class to super class(Object)	
		if(this.age==p2.age&&this.weight==p2.weight&&this.height==p2.height)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode()
	{
		//Convert all data type to string
		String strage = String.valueOf(age);
		String strweight = String.valueOf(weight);
		String strheight = String.valueOf(height);
		
		//Find Out hashCode of each String
		int hashAge = strage.hashCode();
		int hashweight = strweight.hashCode();
		int hashheight = strheight.hashCode();
		
		//Sum All The hashCode
		int hash = hashAge+hashheight+hashweight;
		
		return hash;
	}
	
}

public class ObjectClassMethodsOverWrite
{

	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		System.out.println(s1);  //s1.toString();		this is of String Class
		String s2 = new String("abc");
		System.out.println(s2);	//s2.toString();		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Person p1 = new Person(20,45.5f,5.2);
		System.out.println(p1);		//p1.toString(); 	of Object Class which is the super class So we overwrite it in our Class
		Person p2 = new Person(20,45.5f,5.2);
		System.out.println(p1.equals(p2));	//p1.equals();	of Object Class So we OverWrite it also
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.hashCode()==p2.hashCode());
	}

}
