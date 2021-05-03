package com.rt.q4;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		float duration = sc.nextFloat();
		float amt = sc.nextFloat();
		
		if(type.equals("Ordinary"))
		{
			Ordinary ord = new Ordinary(duration,amt);
			ord.bill();
		}
		else if(type.equals("Urgent"))
		{
			Urgent ord = new Urgent(duration,amt);
			ord.bill();
		}
		else
		{
			Lightening ord = new Lightening(duration,amt);
			ord.bill();
		}
		sc.close();
		
	}
}
