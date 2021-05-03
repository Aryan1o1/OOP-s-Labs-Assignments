package com.rt.q3;


public class Nonnumeric {

	
	public static boolean modulo(String c, String d)
	{
		try
		{
			int a = Integer.parseInt(c);
			int b = Integer.parseInt(d); 
		}
		catch(NumberFormatException e)
		{
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("First argument: "+args[0]);
		System.out.println("Second argument: "+args[1]+"\n");
		 
		try
		{
		 if(modulo(args[0],args[1]))
			 throw new Excep();
		 else
			 System.out.println("No exception thrown."); 
		}
		 catch(Excep e)
		 { 
			 System.out.println(e);
		 }


	}
	
	

}
