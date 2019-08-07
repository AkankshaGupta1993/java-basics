package com.concept.java_basics.cast;

public class TypeCastProblem {

	public static void main(String[] args) {
		A  a = new A();
		try {
			A clone = (A) a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}


class A {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}