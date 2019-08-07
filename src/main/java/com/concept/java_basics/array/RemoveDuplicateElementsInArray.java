package com.concept.java_basics.array;

import java.util.ArrayList;

public class RemoveDuplicateElementsInArray {
	
	public static int[] removeDupicates(int [] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int val : arr) {
			
			if (!list.contains(val)) {
				list.add(val);
			}
		}
		
		int [] filtered = new int [list.size()];
		
		for (int i = 0; i < filtered.length; i++)
		{
			filtered[i] = list.get(i);
		}
		return filtered;
	}
	
 public static void main(String[] args) {
	 int [] arr = {2, 3, 4, 5, 6, 2 , 3, 4, 8};
	int [] ar = removeDupicates(arr);

	for (int val : ar) {
		System.out.println(val);
	}
 }
}
