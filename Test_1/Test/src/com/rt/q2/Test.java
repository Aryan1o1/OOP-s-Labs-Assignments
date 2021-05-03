package com.rt.q2;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Department dep = new Department(101,"ACC");
		Employee e1 = new Employee(1,"Harry",dep);
		
		System.out.println(e1);
		
		Employee e2 = e1.clone();
		
		System.out.println(e2);
		
		e1.setId(10);
		e2.getDep().setDname("Manager");
		
		System.out.println(e1);
		System.out.println(e2);

	}

}



