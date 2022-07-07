package com.tns.java;

public class Outer {

	//initiating variables
	int x=10;
	static int y=200;

	static class inner
	{
		//inner class method
		public void method_demo()
		{
			System.out.println("I am inner class");
			y=100;
			System.out.println(y);
					
		}
	}

	public static void main(String[] args) {
		//creating object for inner class
		Outer.inner obj = new Outer.inner();
		obj.method_demo();

	}

}
