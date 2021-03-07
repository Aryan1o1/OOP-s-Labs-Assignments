package com.r177219053q1;

import java.util.Scanner;

public class Combination 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number");
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The combination are");
		  for (int i=0;i<3;i++) 
		  {
		   for (int j=0;j<3;j++) 
		   {
		    for (int k=0;k<3;k++) 
		    {
		     if (i!=j && j!=k && k!=i) 
		     {
		      System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
		     }
		    }
		   }
		  }

	}

}
