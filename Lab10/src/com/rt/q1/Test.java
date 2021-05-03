package com.rt.q1;

public class Test {

	public static void main(String[] args) 
	{
		// implementation of A class which extends Thread
		A t1 = new A();
		t1.start();
		
		A t2 = new A();
		t2.start();
		
		A t3 = new A();
		t3.start();
		
		//implmentation of B class which implements ruunable interface
		B obj1 = new B();
		Thread t4 = new Thread(obj1);
		t4.start();
		
		B obj2 = new B();
		Thread t5 = new Thread(obj2);
		t5.start();
		
		
	}

}
