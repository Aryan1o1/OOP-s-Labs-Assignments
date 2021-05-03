package com.rt.q1;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names of 10 student");
		int roll_no[] = new int[10];
		String name[] = new String[10];
		
		for(int i =0;i<10;i++)
		{
			name[i] = sc.nextLine();
		}
		
		String n4 = name[4];
		int r4 = roll_no[4]; 
		System.out.println("Name of Student: "+n4+"\tRoll No. of Student: "+r4); 
		try
		{ 
		 int r11 = roll_no[10]; 
		 System.out.println("Marks are " + r11);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		 System.out.println("Exception caught: "+e);
		 System.out.println("Execution continued.");
		}

	}

}
