package com.tns.java;

//Class Animal (Parent class)
class Animal
{
	//method in Animal class
	public void m(Animal a) {
	System.out.println("Animal");
	}

}

//Class Monkey (Child class)
class Monkey extends Animal
{
	//method in Monkey class
	public void m(Monkey m1) {
		System.out.println("Moneky");
	}
}
public class Test {

	public static void main(String[] args) {

		//creating Animal class object
		Animal a = new Animal();
		a.m(a); //calling Animal class method

		//creating Monkey class object
		Monkey m1= new Monkey();
		m1.m(m1);//calling Animal class method

		Animal a1 = new Monkey();
		a1.m(a1);

	}

}
