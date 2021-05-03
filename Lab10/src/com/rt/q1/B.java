package com.rt.q1;

public class B extends C implements Runnable
{
	@Override
	public void run() 
	{
		final C obj = new C();
		// TODO Auto-generated method stub
		synchronized(obj)
		{
			obj.fun();
		}
		
	}

}
