package com.java;

/*
 * To Set Name of Thread by setName()
 * second method is by creating constructor
*/

class MyThread1 extends Thread
{
	public MyThread1(String name) 
	{
		super(name);
	}
	public void run() 
	{
		for(int i = 0;i<10;i++)
		{
			System.out.println(getName()+": "+i);
		}
	}
}

public class ThreadDemo3 
{

	public static void main(String[] args) 
	{
		Thread main = Thread.currentThread();	//main thread gives the object of current thread and shows name of current thread
		main.setName("C++");			//	setName() is used to set the name of thread
		System.out.println(main.getName());	//	getName() is used to get the current thread name
		MyThread1 t1 = new MyThread1("JAVACON");	//		creating object of MyThread1
		//t1.setName("JAVA");		//		setting t1 thread name by JAVA
		t1.start();		//		Used for starting the thread
	}

}
