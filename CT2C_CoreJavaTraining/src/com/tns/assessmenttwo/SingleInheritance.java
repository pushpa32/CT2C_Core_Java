package com.tns.assessmenttwo;

//Program to demonstrate a single Inheritance in Java

class Animal { // Animal Class
	void sleep() { // Animal's sleep function
		System.out.println("Sleeping!");
	}
}

class Cat extends Animal { // Cat class inheriting Animal Class
	void sound() { // Cat's class sound function
		System.out.println("Meow!");
	}
}

//Main Class
public class SingleInheritance {

	public static void main(String[] args) {
		Cat obj = new Cat(); // creating object for Cat class

		// calling both the function from Cat's object
		obj.sleep();
		obj.sound();

	}

}
