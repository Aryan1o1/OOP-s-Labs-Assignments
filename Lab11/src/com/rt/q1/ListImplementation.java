package com.rt.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListImplementation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println("Reading elements from ArrayList");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		Object list2 = list.clone();
		System.out.println(list2);

		System.out.println("Reversing ArrayList");
		Collections.reverse((ArrayList)list2);
		System.out.println(list2);



	}

}
