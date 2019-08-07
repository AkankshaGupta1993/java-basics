package com.concept.java_basics.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasic {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add("BLR");
		set.add("BLR");
		set.add("DEL");
		set.add("CCU");
		set.add("CCU");
		set.add("BOM");
		
		for (String val : set) {
			System.out.println(val);
		}
	}
}