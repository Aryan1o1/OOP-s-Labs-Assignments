package com.rt.q5;

import java.util.Scanner;

public class Organization {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int salary = sc.nextInt();
		int empid = sc.nextInt();
		String dep = sc.next();
		int inc = sc.nextInt();
		Manager e1 = new Manager(name,empid,salary,dep,inc);
		e1.show();
		System.out.println("\n");
		e1.salary = (int)e1.increaseSalary(dep,inc);
		e1.show();
		System.out.println();
		
		
	}

}
