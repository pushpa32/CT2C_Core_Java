//Java program to demonstrate the Unboxing in Wrapper class

package com.tns.java.wrapperclass;

public class UnboxingDemo {

	public static void main(String[] args) {

		Character ch = 'a'; // Character object

		// Unboxing - Character to primitive data
		char a = ch;

		// display the result
		System.out.println("Character ch: " + ch);
		System.out.println("char a: " + a);

	}

}
