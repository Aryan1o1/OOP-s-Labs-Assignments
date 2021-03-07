package com.r177219053q2;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) 
	{
		;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum =0;
		System.out.println("Enter the numbers");
		for(int i =0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The square of each number is :");
		for(int i =0;i<10;i++)
		{
			sum =sum+ (arr[i]*arr[i]);
			System.out.println("Square of "+arr[i]+"the number is "+arr[i]*arr[i]);
		}
		System.out.println("The required sum is"+sum);
		

	}

}
