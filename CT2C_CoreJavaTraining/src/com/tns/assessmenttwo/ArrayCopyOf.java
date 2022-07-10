package com.tns.assessmenttwo;

import java.util.Arrays; //import Arrays Class

//Program to demonstrate the copyOf function in Arrays

public class ArrayCopyOf {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 }; // Array initialization

		// Printing the elements in a single line
		System.out.println("Integer Array: " + Arrays.toString(arr));

		System.out.println("\nNew Arrays by copyOf:");

		// Returns the copied value of array passed.
		// Also the second parameter of this function is the number of elements you want
		// in copied array
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(arr, 8)));
	}

}
