package com.java;

import java.util.Scanner;

public class UserDefinedException 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
			if(salary>0)
			{
				System.out.println(salary);	
			}
			else
			{
				throw new EmployeeSalaryNegativeException("Emp Salary Negative Not Allowed");
			}
	}//runtime exception don't have try catch where as compile time is mandatory to have try catch block always preferred runtime exception

}
