package com.tns.java;

public class ConstructorSample {

	//constructor of this class
	ConstructorSample() {
		//prints each time the new object is created
		System.out.println("I am Constructor");
	}

	public static void main(String[] args) {

		//creating objects
		ConstructorSample obj1 = new ConstructorSample();
		ConstructorSample obj2 = new ConstructorSample();
		ConstructorSample obj3 = new ConstructorSample();
		ConstructorSample obj4 = new ConstructorSample();
		ConstructorSample obj5 = new ConstructorSample();
	}

}
