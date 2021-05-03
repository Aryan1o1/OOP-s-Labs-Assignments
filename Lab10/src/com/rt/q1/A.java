package com.rt.q1;

public class A extends Thread
{
	public void fun()
	{
		for(int i =5;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+
					" i="+i);
		}
		
	}
	
	public void run() 
	{
		// TODO Auto-generated method stub
		A obj = new A();
		synchronized(obj)
		{
			obj.fun();
		}
		
	}
}
