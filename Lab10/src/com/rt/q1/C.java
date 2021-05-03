package com.rt.q1;

public class C 
{
	public void fun()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i="+i);
		}
	}
}
