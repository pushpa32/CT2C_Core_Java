//Java program to demonstrate the wrapper class with ArrayList
//Also the use of Boolean object

package com.tns.java.wrapperclass;

import java.util.ArrayList;

public class ArrayListWrapper {

	public static void main(String[] args) {

		// Declaring ArrayList
		ArrayList arr = new ArrayList();
		Integer in = new Integer(10); // Autoboxing

		arr.add(in); // adding to an ArrayList

		// display the result
		System.out.println(arr);

		// Example with Boolean
		Boolean a = new Boolean("true"); // Gives true if true, TRUE or True otherwise gives false
		Boolean b = new Boolean("NO");

		System.out.println(a);
		System.out.println(b);
		System.out.println(b.equals(a));

	}

}
