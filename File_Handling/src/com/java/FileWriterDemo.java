package com.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) 
	{
		File f1 = new File("D://demo.txt");
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(f1,true);
			fw.write("www.java.com");
			long leng = f1.length();
			System.out.println(leng);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.flush();
					fw.close();
					fw=null;	
				}
				long leng = f1.length();
				System.out.println(leng);
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}

	}

}
