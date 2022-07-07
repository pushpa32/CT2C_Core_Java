package com.tns.java;

public class StringConcat {

	public static void main(String[] args) {
		//initializing string
		String s="Amchi ";
		s=s.concat("Mumbai "); //concatenating with Mumbai
		System.out.println(s);
		
		//concatenating with Maharashtra  
		s= s+"Maharashtra";
		System.out.println(s);
		
		s+=" India";//   concatenating with India  
		System.out.println(s);

	}

}
