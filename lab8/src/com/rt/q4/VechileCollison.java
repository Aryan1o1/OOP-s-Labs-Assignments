package com.rt.q4;

import java.util.Scanner;

public class VechileCollison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1 = null, t2 = null;
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("enter the direction of vehicle 1");
			t1 = sc.nextLine();
			System.out.println("enter the direction of vehicle 2");
			t2 = sc.nextLine();
			if (!t1.equals(t2))
				throw new Collison("vehicle 2 has to go on " + t1 + " direction");
		} catch (Collison e) {
			System.out.println(e);
			t2 = t1;
			System.out.println("the collision has been avoided by redirection vehicle 2");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("direction of vehicle 1 :" + t1);
		System.out.println("direction of vehicle 2 :" + t2);

	}

}
