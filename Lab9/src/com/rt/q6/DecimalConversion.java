package com.rt.q6;

import java.util.Scanner;

public class DecimalConversion {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		System.out.printf("Enter float Value:\t");
		float n= input.nextFloat();

		@SuppressWarnings("deprecation")
		Float F= new Float(n);
		System.out.println("Converted float to Float:\t"+F); 
		System.out.println("Example:\t"+(F+1.25f));// Addition
		
		String S = String.valueOf(F);
		System.out.println("Converted Float to String :\t"+S);
		System.out.println("Example:\t"+(S+"1.25"));//Concatenation
		
		float c = Float.parseFloat(S);
		System.out.println("Converted String to float :\t"+c); 
		System.out.println("Example:\t"+(c+1.25f));// Addition
		
		String Q=String.valueOf(c);
		System.out.println("Converted float to String :\t"+Q);
		System.out.println("Example:\t"+(Q+"1.25"));// Concatenation 
		
		Float R=Float.valueOf(S);
		System.out.println("Converted String to Float :\t"+R); 
		System.out.println("Example:\t"+(R+1.25f));// Addition

		float f= R.floatValue(); 
		System.out.println("Converted Float to float :\t"+f);
		System.out.println("Example:\t"+(f+1.25f));// Addition

		input.close();

	}

}
