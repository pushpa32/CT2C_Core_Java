package com.tns.assessmenttwo;

//Multiple Inheritance with the help of Interface

interface Eat { // Eat interface
	void eat(); // abstract function
}

interface Sleep {// Sleep interface
	void sleep(); // abstract function
}

//class Habit inherits both Eat and Sleep Interface
class Habit implements Eat, Sleep {
	public void eat() { // eat function for Eat Interface
		System.out.println("Eating Habit!");
	}

	public void sleep() { // sleep function for Sleep Interface
		System.out.println("Sleeping Habit!");
	}
}

public class MultipleInheritanceByInterface {
	public static void main(String args[]) {
		Habit habitObj = new Habit(); // creating Habit object

		// Calling eeach of the function from Habit's object
		habitObj.eat();
		habitObj.sleep();
	}
}