package com.concept.java_basics.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapBasics {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		
		map.put("BLR", "Kempaogowda Bangalore Airport");
		map.put("DEL", "IGI Delhi Airport");
		map.put("BOM", "Mumbai Airport");
		map.put("CCU", "Kolkata Airport1");
		map.put("CCU", "Kolkata Airport2");
		map.put("CCU", "Kolkata Airport3");
		
		for (Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("==============================");
		
		System.out.println(map.get("BLR"));
		map.put("BLR", "Bengaluru Airport");
		
		System.out.println("==============================");
		
		for (Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("==============================");
		
		Set<String> keys = map.keySet();
		Collection<String> values =  map.values();
		
		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
