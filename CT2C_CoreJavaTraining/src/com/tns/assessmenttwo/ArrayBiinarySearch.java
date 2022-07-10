package com.tns.assessmenttwo;

import java.util.Arrays; //import Arrays Class

//Program to demonstrate the binary search function in Arrays

public class ArrayBiinarySearch {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 }; // array initialization

		// first sorting the array with sort inbuilt function
		Arrays.sort(arr);

		// returns the index number where the key value is found in an array
		System.out.println("Found at index: " + Arrays.binarySearch(arr, 20));

	}

}
