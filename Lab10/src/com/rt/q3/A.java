package com.rt.q3;

public class A implements Runnable
{
	int n = 1;
	@Override
    public void run() 
	{
		A obj = new A();
		synchronized(obj)
		{
			obj.fun();
			System.out.println(n++);
		}
	}
	
	public void fun()
	{
		//
	}
}
