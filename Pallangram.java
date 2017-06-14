package com.java;

import java.util.Scanner;

public class Pallangram 
{

	public static void main(String[] args) 
	{
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		Scanner sr = new Scanner(System.in);
		String s2 = new String(sr.nextLine());
		s2=s2.toLowerCase();
		int a=25,flag=0;
		while(a>0)
		{
			if(s2.indexOf(s1.charAt(a))!=-1)
			{
				flag=0;
			}
			else
			{
				flag=1;
				System.out.println("String is Not Palagram");
				break;
			}
			a--;
		}
		if(flag==0)
		{
			System.out.println("String is Pallingram");
		}
		sr.close();
	}

}
