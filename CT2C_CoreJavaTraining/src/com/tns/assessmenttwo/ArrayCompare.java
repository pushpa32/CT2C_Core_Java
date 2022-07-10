package com.tns.assessmenttwo;

import java.util.Arrays; //import Arrays Class

//Program to demonstrate the compare function in Arrays

public class ArrayCompare {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 }; // first array
		int arr2[] = { 10, 30, 50 }; // second array

		// Comparing both arrays with compare function
		// returns 0 if equal else returns 1
		System.out.println("Comparing: " + Arrays.compare(arr1, arr2));

	}

}
