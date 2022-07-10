package com.tns.assessmenttwo;

import java.util.Arrays; //import Arrays Class

//Program to demonstrate the sort function in Arrays

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 60, 40, 10, 5, 100 }; // Array initialization

		// To sort the array using normal sort-
		Arrays.sort(arr);

		// Display the Array after sorting
		System.out.println("Integer Array: " + Arrays.toString(arr));
	}

}
