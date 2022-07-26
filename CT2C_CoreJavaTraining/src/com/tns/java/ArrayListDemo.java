// Java program to demonstrate the use of ArrayList

package com.tns.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList arrList = new ArrayList(); // Growable in nature
		arrList.add("A"); // heterogeneous
		arrList.add(1000); // support of in built methods
		arrList.add(4.5);
		arrList.add(null);

		arrList.remove(2); // remove method to remove element from a particular index number

		arrList.add(2, "M"); // add element to a specific index number
		arrList.add("N");

		System.out.println(arrList); // print the List

	}

}
