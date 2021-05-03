package com.rt.q2;

public class Player 
{
	String name;
	int age;

	public Player(String name,int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
	public void print()
	{
		System.out.println("THe Name of player is "+name);
		System.out.println("age of player is "+age);
		
	}
}
