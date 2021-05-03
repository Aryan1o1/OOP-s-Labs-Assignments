package com.rt.q5;

import java.io.IOException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		String name;
		int age;
		System.out.println("Enter employee name and age:");
		Scanner in = new Scanner(System.in);
		try {
			if (!(in.nextLine().matches("[a-zA-Z]+"))) {
				throw new IOException();
			}
			age = in.nextInt();
			if (age > 50) {
				System.out.println("Age more than 50 yrs");
				throw new Exception();
			}
			Employee x = new Employee();
		} catch (Exception e) {
			System.out.println("Exception");
		}

		// TODO Auto-generated method stub

	}

}
