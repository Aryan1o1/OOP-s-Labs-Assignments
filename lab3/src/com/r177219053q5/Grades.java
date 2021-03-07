package com.r177219053q5;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int marks[] = new int[10];
		String student[] = new String[10];
		String result[]  =new String[10];
		
		Scanner sc = new Scanner(System.in);
		Grades obj = new Grades();
		System.out.println("Enter a marks of 10 students");
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter marks of  "+(i+1)+" Student ");
			student[i] = sc.next();
			marks[i] = sc.nextInt();
		}
		//Ascending order
		obj.sort(marks,student);
		
		for(int i=0;i<10;i++)
		{
			System.out.print(student[i]+" ");
		}
		System.out.println("");
		obj.printArray(marks);
		System.out.println("");
		//grades
		for(int i =0;i<10;i++)
		{
			int m = marks[i];
			if(m>=40 && m<=50)
				result[i]="PASS";
			else if(m>=51 && m<=75)
				result[i]="MERIT";
			else if(m>75)
				result[i]="DISTINCTION";
				
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(student[i]+" ");
			
		}
		System.out.println("");
		obj.printArray(marks);
		System.out.println("");
		for(int i=0;i<10;i++)
		{
			System.out.print(result[i]+"\t");
		}
		
	}
	
	void sort(int arr[],String str[])
    {
        for (int i = 0; i < 9; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < 10; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            String temp1 = str[min_idx];
            str[min_idx] = str[i];
            str[i] = temp1;
        }
    }
	
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
