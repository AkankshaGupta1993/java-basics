package com.concept.java_basics.string;

import java.util.HashMap;
import java.util.Map;

public class CharFrequncyInString {
	
	public static void main(String[] args) {
		Map<Character, Integer> fm = new HashMap<>();
		String name = "Akanksha is very goog , ajjhkhjj hfhg hfhfhg";
		char [] charArray = name.toCharArray();
		
		for(int i=0; i < charArray.length;i++) {
			//System.out.println(charArray[i]);
			Character ch = Character.toUpperCase(charArray[i]);
			Integer count = fm.get(ch);
			if(count == null) {
				fm.put(ch, 1);
				
				}else {
					fm.put(ch, count+1);
				}
			
		}
		System.out.println(fm);
		}
}
