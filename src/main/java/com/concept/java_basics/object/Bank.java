package com.concept.java_basics.object;

public class Bank {

	protected String name;
	
	//public Bank () {
		//System.out.println("constructor clalled Bank");
	//}
	
	public Bank (String name) {
		System.out.println("constructor clalled Bank");
		this.name = name;
	}
	
	
	public String getName () {
		return this.name;
	}
	
}
