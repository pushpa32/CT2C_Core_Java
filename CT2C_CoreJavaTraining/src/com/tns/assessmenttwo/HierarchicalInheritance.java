package com.tns.assessmenttwo;

//Program to demonstrate a Hierarchical Inheritance in Java

class Vehicles {
	public void speed(int s) { // speed function of Vehicles class
		System.out.println("Speed Applied: " + s);
	}

	public void breakApplied() {
		System.out.println("Break is applied!");
	}
}

class Car extends Vehicles { // Car class inheriting Vehicles class

	public void carFunction() { // Car class function
		System.out.println("I am Car!");
	}
}

class Bike extends Vehicles { // Bike class inheriting Vehicles class

	public void bikeFunction() { // Bike class function
		System.out.println("I am Bike!");
	}
}

public class HierarchicalInheritance {

	public static void main(String args[]) {
		Bike bObj = new Bike(); // creating object for Bike class
		Car cObj = new Car(); // creating object for Car class

		// calling function from bike class and vehicle class with Bike object
		bObj.bikeFunction();
		bObj.speed(80);
		bObj.breakApplied();

		// calling function from car class and vehicle class with Bike object
		cObj.carFunction();
		cObj.speed(70);
		cObj.breakApplied();
	}
}
