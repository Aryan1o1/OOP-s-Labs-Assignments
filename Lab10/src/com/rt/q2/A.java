package com.rt.q2;

public class A  extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.even();
		
	}
	public void even()
	{
		System.out.println("even");
		for(int i=0;i<20;i++)
			if(i%2==0)
			System.out.println(i);	
	}
	
}
