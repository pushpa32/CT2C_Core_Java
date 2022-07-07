package com.tns.java;

public class Array3D {
	public static void main(String[] args) {
		
		//initiating 3D array with values
		byte[][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		
		//Printing the values according to the index number 
		 System.out.println(x[0][1][2]);//60
		 
		 System.out.println(x[1][0][1]);//80
		 
		 System.out.println(x[1][2][0]);// Error: ARRAY INDEX OUT OF BOUND EXCEPTION
		 
		 System.out.println(x[1][1][1]);//100
		 
		 System.out.println(x[2][1][0]);//AIOB
		 
		 //print the length of an array
		 System.out.println(x.length);	

	}

}
