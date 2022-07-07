package com.tns.java;

public class String1 {

	public static void main(String[] args) {
		       
		        String s=new String("AVANTIKA");// immutable object
		        
		        //Use of various inbuilt function on String s
				System.out.println(s.concat("Tiwari"));
				System.out.println(s.toLowerCase());
				System.out.println(s.toUpperCase());
				
				//Use of various inbuilt function on String s1
				String s1="MUMBAI";
				System.out.println(s1.equals("mumbai"));
				System.out.println(s1.equalsIgnoreCase("mumbai"));
				System.out.println(s1.replace('M', 'T'));
				
				System.out.println(s.trim());
				System.out.println(s.substring(2));
				System.out.println(s.substring(3,8));

	}

}
