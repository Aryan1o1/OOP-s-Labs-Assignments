package com.rt.q3;

public class Worker 
{
	String name;
	int salary_rate;
	
	Worker(String name,int salary_rate)
	{
		this.name=name;
		this.salary_rate = salary_rate;
	}
	
	public void Compay(int hours)
	{
		int total_salary = hours * salary_rate;
		System.out.println("Name: "+name+"Salary: "+total_salary);
	}
}
