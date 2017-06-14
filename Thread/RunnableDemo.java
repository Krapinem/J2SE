package com.java;

class MyRunnable implements Runnable
{
	public void run() 
	{
			for(int i=0;i<0;i++)
			{
				System.out.println(i);
			}
	}
}
public class RunnableDemo 
{

	public static void main(String[] args) 
	{
		MyRunnable r1 = new MyRunnable();
		Thread t1= new Thread(r1);		// r1 is passed to call the run of MyRunnable otherwise It calls Run of Thread Class
		t1.start();
		
	}

}
