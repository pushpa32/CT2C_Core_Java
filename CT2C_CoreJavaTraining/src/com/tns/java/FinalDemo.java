package com.tns.java;

public class FinalDemo {

	public static void main(String[] args) {

		//declaring final variable
		final int a=10;
		System.out.println(a);
		
		a=100; //Exception: final variable cannot be re-assigned
		System.out.println(a);

	}

}
