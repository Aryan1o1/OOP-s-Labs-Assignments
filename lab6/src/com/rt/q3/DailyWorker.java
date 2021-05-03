package com.rt.q3;

public class DailyWorker extends Worker
{
	public DailyWorker(String name , int salary_rate)
	{
		super(name,salary_rate);
	}
	
	public void Compay(int hours)
	{
		int days=hours/24;
		super.Compay(days);
	}
}

