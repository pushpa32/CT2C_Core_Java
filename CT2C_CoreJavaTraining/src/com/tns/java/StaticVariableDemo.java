package com.tns.java;

public class StaticVariableDemo {
	
	//Initiate variable
	String name;
	int roll;
	//static variable coll
	static String coll = " Cotton College";
	
	//display method
	void display() {
		System.out.println(name+" "+roll+" "+coll);
	}
	
	public StaticVariableDemo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	public static void main(String[] args) {
		
		//Create objects
		StaticVariableDemo s1 = new StaticVariableDemo("Karan", 1);
		StaticVariableDemo s2 = new StaticVariableDemo("Prashant", 1);
		
		//call method
		s1.display();
		s2.display();
	}

}
