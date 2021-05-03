package com.rt.q3;

public class SalaryWorker extends Worker
{
	public SalaryWorker(String name ,int salary_rate)
	{
		super(name,salary_rate);
		
	}
	
	public void Compay(int hours)
	{
		int count=hours/40;
		super.Compay(count);
	}

}
