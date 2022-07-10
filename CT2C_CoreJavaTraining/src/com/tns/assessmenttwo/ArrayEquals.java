package com.tns.assessmenttwo;

import java.util.Arrays; //import Arrays Class

//Program to demonstrate the equals function in Arrays

public class ArrayEquals {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 }; // first array
		int arr2[] = { 10, 30, 50 }; // second array

		// Checks both arrays for equality
		// Returns true if equal else returns false
		System.out.println("Integer Arrays on comparison: " + Arrays.equals(arr1, arr2));
	}

}
