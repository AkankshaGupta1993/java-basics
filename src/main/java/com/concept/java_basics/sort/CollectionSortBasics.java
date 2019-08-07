package com.concept.java_basics.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortBasics {

	public static void main(String[] args) {
		List<Integer> names = Arrays.asList(16, 24, 5, 67, 34);
		
		Collections.sort(names, Comparator.reverseOrder());
		for (Integer name : names) {
			System.out.println(name);
		}
	}
}


/*
 * class StringComparator implements Comparator<String> {
 * 
 * @Override public int compare (String s1, String s2) { return
 * s2.compareTo(s1); } }
 */
