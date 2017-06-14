package com.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo 
{
	public static void main(String[] args) 
	{
		File f1 =null;
		FileReader fr = null;
		try
		{
			f1 = new File("D://demo.txt");
			fr = new FileReader(f1);
			/*int in = fr.read();
			System.out.println((char)in);*/ //only read one character at a time
			/*int in = 0;
			while((in=fr.read())!=-1) 
			{
				System.out.println((char)(in));
			}*/
			char all[] = new char[(int)(f1.length())];
			fr.read(all);
			for(char a: all)
			{
				System.out.print(a);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fr!=null)
				{
					fr.close();
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
		
	}
}
