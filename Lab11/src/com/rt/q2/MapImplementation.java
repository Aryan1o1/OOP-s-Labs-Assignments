package com.rt.q2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String,String>();

		hm.put("first", "Siddhant");
		hm.put("second", "Walia");
		hm.put("third","Ravi");
		
		System.out.println(hm);
		
		if(hm.containsKey("first")){
			System.out.println("The hashmap contains key first");
		} else {
			System.out.println("The hashmap does not contains key first");
		}
		if(hm.containsKey("fifth")){
			System.out.println("The hashmap contains key fifth");
		} else {
			System.out.println("The hashmap does not contains key fifth");
		}
		if(hm.containsValue("Siddhant")){
			System.out.println("The hashmap contains Value");
		} else {
			System.out.println("The hashmap does not contains Value");
		}
		if(hm.containsKey("Rajesh")){
			System.out.println("The hashmap contains Value");
		} else {
			System.out.println("The hashmap does not contains Value");
		}

		Set<String> keys= hm.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		Set<Entry<String, String>> entires = hm.entrySet();

		for(Entry<String,String> ent:entires)
		{
			System.out.println(ent.getKey()+" ==>"+ent.getValue());
		}


	}

}
