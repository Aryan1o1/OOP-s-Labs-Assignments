package com.rt.q2;

public class B extends Thread
{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.odd();
		
	}
	public void odd()
	{
		System.out.println("odd");
		for(int i=0;i<20;i++)
			if(i%2!=0)
			System.out.println(i);	
	}

}
