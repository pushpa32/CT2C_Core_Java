package com.tns.java;

public class StaticBlockDemo {
	public static void main(String[] args) {
		
		//this will be printed at last
		System.out.println(5+5);
		
		//call the m method to print it
		m();
	}
	//static method
	static void m() {
		System.out.println(2+2);
	}

	//Static blocks
	static {
		System.out.println(10+10);
	}
	static {
		m();
		System.out.println(10+20);
	}
	static {
		System.out.println(10+30);
	}
	static {
		System.out.println(10+40);
	}
	
}
