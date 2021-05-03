package com.rt.q2;

public class Divide {

	public static void main(String[] args) 
	{
		int den=0,num=10,div=0;
		
		 try
		 {
		 div=num/den;
		 }
		 
		 catch(ArithmeticException e)
		 {
		 System.out.println("When trying to divide by 0");
		 div=1;
		 }
		 
		 catch(Exception e)
		 {
		 System.out.println(e);
		 }
		 
		 System.out.println("Answer :"+div);
		 
		 
	}

}
