package com.java;

class One
{
	void get(int i)
	{
		int j=i/(i-9);
		System.out.println(Thread.currentThread().getName()+": "+j);
	}
}

class Two
{
	One one = new One();
	void show(int i)
	{
		one.get(i);
	}
}

class OneTwo extends Thread
{
	int i;
	OneTwo(int i) 
	{
		this.i=i;
	}
	Two two = new Two();
	public void run()
	{
		two.show(i);
	}
}

class First
{
	void get(int i)
	{
		int j=i/(i-9);
		System.out.println(Thread.currentThread().getName()+": "+j);
	}
}

class Second
{
	First first = new First();
	void show(int i)
	{
		first.get(i);
	}
}

class FirstSecond extends Thread
{
	int i;
	FirstSecond(int i) 
	{
		this.i=i;
	}
	Second second = new Second();
	public void run()
	{
		second.show(i);
	}
}


public class ThreadWithException 
{

	public static void main(String[] args) 
	{
		OneTwo t1 = new OneTwo(9);
		FirstSecond t2 = new FirstSecond(10);
		t1.start();
		t2.start();
		int i = Integer.parseInt(args[0]);
		int j=i/(i-9);
		System.out.println(j);
	}

}
