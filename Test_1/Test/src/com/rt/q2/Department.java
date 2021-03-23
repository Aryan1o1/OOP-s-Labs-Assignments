package com.rt.q2;

public class Department implements Cloneable
{
	private int did;
	private String dname;
	
	public int getDid() 
	{
		return did;
	}
	public void setDid(int did) 
	{
		this.did = did;
	}
	public String getDname() 
	{
		return dname;
	}
	public void setDname(String dname) 
	{
		this.dname = dname;
	}
	
	public Department(int did, String dname) 
	{
		super();
		this.did = did;
		this.dname = dname;
	}
	
	@Override
	public String toString()
	{
		return(" Department id "+did+" Department name  "+dname);
		
	}
	
	@Override
	protected Department clone() throws CloneNotSupportedException
	{
		return (Department)super.clone();
	}
	
}
