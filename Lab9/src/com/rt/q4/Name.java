package com.rt.q4;

public class Name 
{
	String name;
	
	public Name(String name) 
	{
		super();
		this.name = name;
	}
	
	public void display() 
	{
		System.out.println("The given name is "+name);
		name = name.toLowerCase();
	
		int len = name.length();
		int a_count = 0;
		System.out.println("Length: "+len);
		System.out.println("Character 'a' found at positions -");
		
		for(int i=0;i<len;i++)
		{
			if (name.charAt(i)=='a')
			{
				System.out.println(i+" ");
				a_count++;
			}
		}
		if(a_count==0)
			System.out.print(-1);
		System.out.println("\nFrequency of 'a' : "+a_count);

	}

	public static void main(String[] args) 
	{
		Name obj = new Name("Aryan Rastogi");
		obj.display();
		Name obj2 = new Name("Hello world");
		obj2.display();}}

	
