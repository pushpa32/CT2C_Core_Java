package com.tns.java;
import java.util.Scanner; 

public class Array1 {
	public static void main(String[] args) {
		
		int size;  
		Scanner s=new Scanner(System.in);  
		
		//user input with the help of Scanner class
		System.out.print("Enter the size of the Array");  
		size=s.nextInt();  
		
		// declaring array
		int[] array = new int[10];  
		
		//elements of array from user
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<size; i++)  
			array[i]=s.nextInt();  

		//displaying the array elements
		for (int i=0; i<size; i++) 
			System.out.println(array[i]);
		
	}

}
