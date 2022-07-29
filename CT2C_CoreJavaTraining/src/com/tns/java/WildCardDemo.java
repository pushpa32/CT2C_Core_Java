//Java program to demonstrate the use of wildcard in generics

package com.tns.java;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {

		// creating a list with two different types
		List<Integer> list1 = Arrays.asList(14, 45, 78, 63, 89);
		List<Double> list2 = Arrays.asList(2.3, 6.8, 7.8, 6.3, 8.9);

		// calling printList user defined function by passing list
		printList(list1);
		printList(list1);

	}

	public static void printList(List<?> list) {
		System.out.println(list); // print the list passed as an argument

	}

}
