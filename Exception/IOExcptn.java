package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExcptn 
{

	public static void main(String[] args) throws IOException
	{
		//try
		//{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter College Name");
			String cname = br.readLine();
			System.out.println(cname);
		/*}
		catch(IOException ex)
		{
			System.out.println("IO Exception");
		}*/
		
	}

}
