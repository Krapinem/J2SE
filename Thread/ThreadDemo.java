package com.java;

class MyThread extends Thread	//1
{
	public void run()	//2			//thread-0 	child thread
	{
		for(int i=1;i<=100;i+=2)
		{
			System.out.println(i);	//odd
		}
	}
}


/*
methods

start()
run()
stop()
sleep()
notify()
notifyall()
wait()
suspend()
resume()

*/


public class ThreadDemo //3Thread   1)GarbageCollector 2)Thread Scheadular 3)Main Thread
{

	public static void main(String[] args) //mainThreadManager
	{
		MyThread t1 = new MyThread();
		t1.start();//main thread create child thread using start and start is responsible for calling run method

		for(int i=2;i<=100;i+=2)
		{
			System.out.println(i);	//even
		}
		
	}

}
