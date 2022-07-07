package com.tns.java;

public class ConstructorDemo {
	// declaring variables
	String name;
	int roll;
	
	//creating constructor
	ConstructorDemo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public static void main(String[] args) {

		//creating objects and initializing with values
		ConstructorDemo s1=new ConstructorDemo("Avantika",101);
		ConstructorDemo s2= new ConstructorDemo("Mohini",102);
		
		//printing the output
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);
	}

}
