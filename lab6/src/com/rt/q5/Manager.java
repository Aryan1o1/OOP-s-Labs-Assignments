package com.rt.q5;

public class Manager extends Employee 
{
	String  department;
	int inc;
	Manager(String name,int empid,int salary,String department
			,int inc)
	{
		super(name,empid,salary);
		this .department = department;
		this.inc = inc;
	}
	public void newSal()
	{
		super.increaseSalary(department,inc);
	}
}
