package com.tns.java;

public class MethodOverloading {

	public static void main(String[] args) {
		Tests t = new Tests();

		t.m();
		t.m(1);
		t.m(1.5d);

		// Automatic promotion chart
		// byte->short->char->int->long->float->double
		t.m(1.5f);

	}

}

class Tests {
	public void m() {
		System.out.println("I am empty");
	}

	public void m(int n) {
		System.out.println("I am int");
	}

	public void m(double n) {
		System.out.println("I am double");
	}
}
