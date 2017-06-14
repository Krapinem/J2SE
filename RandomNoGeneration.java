package com.java;

import java.util.Random;

public class RandomNoGeneration 
{
	public static void main(String[] args) 
	{
			// double d = (Math.random()); 			.1 to .9 upto 16 decimal digits
		
			/*int num[] = new int[10];
			for(int i=0;i<10;i++)
			{
				int d = (int)(Math.random()*100);
				System.out.println(d);
				num[i] = d;
			}*/
		
		
		/*Random ran = new Random();
		for(int i=0;i<10;i++)
		{
			System.out.println(Math.abs(ran.nextInt()));
			System.out.println(ran.nextFloat());
			System.out.println(ran.nextDouble());
		}*/
		
	/*	Random ran = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<10;i++)
		{
//			System.out.println((char)ran.nextInt(26)+65);
			char ch = (char)(ran.nextInt(26)+65);
			sb.append(ch+"");
		}
		System.out.println(sb.toString());*/
		
		for(int i=0;i<255;i++)
		{
			System.out.println(i+" :"+(char)i);
		}
		
		//min 8 max 16 && 2 upper case 1 special symbol && also find weak or strong
	}
}
