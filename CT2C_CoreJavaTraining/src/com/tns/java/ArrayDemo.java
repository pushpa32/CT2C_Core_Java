package com.tns.java;

public class ArrayDemo {
	public static void main(String[] args) {
		
		//initiating 3D array with values
		int[][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		//printing the values of array according to the index
		System.out.println(x.length);
		System.out.println(x[0][1][2]);
		System.out.println(x[1][0][1]);
		System.out.println(x[1][1][1]);
		
	//	System.out.println(x[1][2][0]); //Exception: Index out of bound
	//	System.out.println(x[2][1][0]); //Exception: Index out of bound
		
	}

}
