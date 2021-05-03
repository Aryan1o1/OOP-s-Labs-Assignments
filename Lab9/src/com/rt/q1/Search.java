package com.rt.q1;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) 
	{
		int last = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the character or substring to search");
		String k = sc.nextLine();
		
		int l1 = str.length();
		int l2 = k.length();
		for(int i =0;i<=(l1-l2);i++)
		{
			if(str.substring(i,l2+i).equals(k))
			{
				if(last== 0)
				{
					System.out.println("First occurence is at position"+(i+1));
				}
				last = i+1;
			}
		}
		
		if(last!=0)
		{
			System.out.println("Last occurence is at position"+last);
		}
		else
		{
			System.out.println("String is not found");
		}
		
		sc.close();


	}

}
