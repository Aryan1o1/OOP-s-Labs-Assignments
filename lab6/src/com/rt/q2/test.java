package com.rt.q2;

public class test {

	public static void main(String[] args) 
	{
		Player obj = new Player("Aryan" ,12);
		obj.print();
		System.out.println("\n");
		CricketPlayer obj1 = new CricketPlayer("Aryan",20);
		obj1.show();
		System.out.println("\n");
		FootballPlayer obj2 = new FootballPlayer("Aryan",20);
		obj1.show();
		System.out.println("\n");
		HockeyPlayer obj3 = new HockeyPlayer("Aryan",20);
		obj1.show();
		
	}

}
