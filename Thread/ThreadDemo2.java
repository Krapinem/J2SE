package com.java;

class Even extends Thread	//1
{
	public void run()	//2			//thread-0 	child thread
	{
		for(int i=2;i<=100;i+=2)
		{
			System.out.println(getName()+" "+i);	//even			getName() Returns Name of Thread
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}

class Odd extends Thread	//1
{
	public void run()	//2			//thread-1 	child thread
	{
		for(int i=1;i<=100;i+=2)
		{
			System.out.println(getName()+" "+i);	//odd
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}

public class ThreadDemo2 
{

	public static void main(String[] args) 
	{
		Even even = new Even();
		Odd odd = new Odd();
		Thread main = Thread.currentThread();//Return the thread of current thread name //main runs by JVM 
		System.out.println("Main Thread Name: "+main.getName());
		even.start();
		odd.start();
	}

}
