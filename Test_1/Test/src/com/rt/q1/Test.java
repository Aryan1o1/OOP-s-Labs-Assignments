package com.rt.q1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Calc cl = new Calc();
		cl.division(num1, num2);
		cl.modulos(num1, num2);
		
		sc.close();
		
		

	}

}
