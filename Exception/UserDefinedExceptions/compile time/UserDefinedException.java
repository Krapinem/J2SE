package com.java;

import java.util.Scanner;

public class UserDefinedException 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		try
		{
			if(salary>0)
			{
				System.out.println(salary);
			}
			else
			{
				throw new EmployeeSalaryNegativeException("Emp Salary Negative Not Allowed");
			}
		}
		catch(EmployeeSalaryNegativeException ex)
		{
			ex.printStackTrace();
		}
	}

}
