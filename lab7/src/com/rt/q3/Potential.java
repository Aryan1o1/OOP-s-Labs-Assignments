package com.rt.q3;

public class Potential implements Gravity
{
	int m;
	int h;
	
	public Potential(int m, int h) {
		super();
		this.m = m;
		this.h = h;
	}

	@Override
	public void energy() 
	{
		float U = m*g*h;
		System.out.println("Potential energy is "+U+"N");
		// TODO Auto-generated method stub
		
	}
	
}
