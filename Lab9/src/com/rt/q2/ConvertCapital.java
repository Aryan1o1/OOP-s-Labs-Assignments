package com.rt.q2;

import java.util.Scanner;

public class ConvertCapital {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		StringBuffer bf = new StringBuffer(sc.nextLine());
		
		for (int i=0;i<bf.length();i++)
		{
			char ch = bf.charAt(i);
			if(('a'<=ch) && (ch<='z'))
			{
				char upper_ch=(char)(ch+'A'-'a');
				bf.setCharAt(i,upper_ch);
			}
		}
		
		System.out.println(bf);
		sc.close();


	}

}
