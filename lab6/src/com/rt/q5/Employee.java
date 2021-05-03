package com.rt.q5;

public class Employee 
{
	String name;
	int empid;
	int salary;
	int inc;
	public Employee(){
		
	}
	
	public Employee(String name, int empid, int salary) 
	{
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public void show() 
	{
		System.out.println("Name of the employee: "+name+
		"\nSalary of "+name+" is: "+salary+" rupees");
	}
	
	public int increaseSalary(String Department , int inc) 
	{
		this.inc = inc;
		 
		 salary+=(salary*inc)/100;
		 return salary;
	}
}
