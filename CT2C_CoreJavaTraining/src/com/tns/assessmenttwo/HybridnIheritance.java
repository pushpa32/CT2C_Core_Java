package com.tns.assessmenttwo;
//Program to demonstrate a Hybrid Inheritance in Java

//Class B, C extends A which is Hierarchical Inheritance
//And Class D extends B Which already extends A. Hence it becomes Multilevel inheritance

//Class A with its function display
class A {
	public void aDisplay() {
		System.out.println("A");
	}
}

class B extends A { // B class inherits A
	public void bDisplay() {
		System.out.println("B");
	}
}

class C extends A { // C class inherits A
	public void cDisplay() {
		System.out.println("C");
	}

}

class D extends B { // D class inherits B
	public void dDisplay() {
		System.out.println("D");
	}

}

//Main function
class HybridnIheritance {
	public static void main(String args[]) {

		D obj = new D(); // creating D class object

		// calling three different from different class with D oject
		obj.dDisplay();
		obj.bDisplay();
		obj.aDisplay();
	}
}