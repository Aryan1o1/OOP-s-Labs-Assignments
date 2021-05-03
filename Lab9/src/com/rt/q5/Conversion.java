package com.rt.q5;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter int Value:\t");
		int a = input.nextInt();

		@SuppressWarnings("deprecation")
		Integer A = new Integer(a);
		System.out.println("Converted int to Intger: \n"+A);
		String S =  String.valueOf(A);
		System.out.println("Converted Integer to String :\n"+S); 
		// Concatenation
		System.out.println("Example:\t"+(S+"100"));
		input.close(); 
		
		Integer C = Integer.valueOf(S);
		System.out.println("Converted String to Integer: \n"+C); 
		// simple addition
		System.out.println("Example:\t"+(A+100));
		String Q = String.valueOf(a);
		System.out.println("Converted Integer to String :\n"+Q);
		// Concatenation
		System.out.println("Example:\t"+(Q+"100"));
		int r = Integer.parseInt(S);
		System.out.println("Converted String to int:\n"+r);
		// simple addition
		System.out.println("Example:\t"+(r+100));
		
		int t = A.intValue(); 
		System.out.println("Converted Integer to int:\n"+t);
		// simple addition
		System.out.println("Example:\t"+(t+100));
		

	}

}
