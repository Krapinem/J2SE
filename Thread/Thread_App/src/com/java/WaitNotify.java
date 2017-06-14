package com.java;

class Calculator extends Thread
{
	int total=0;
	public synchronized void run() 
	{
		System.out.println(getName()+" 1 to 10 calculation start ");
		for (int i = 1; i <= 10; i++) 
		{
			total= total + i;
		}
		notifyAll();
	}
}
class Reader extends Thread
{
	Calculator c1=null;
	public Reader(Calculator c1) 
	{
		this.c1=c1;
	}
	public void run() 
	{
		synchronized (c1) 		//Wait and Notify only come in Synchronise
		{
			try
			{
				c1.wait();
				System.out.println(getName()+" 1 to 10 total"+c1.total);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
public class WaitNotify 
{
	public static void main(String[] args) 
	{
		Calculator c1 = new Calculator();
		Reader r1 = new Reader(c1);
		Reader r2 = new Reader(c1);
		Reader r3 = new Reader(c1);
		r1.start();
		r2.start();
		r3.start();
		c1.start();
	}
}