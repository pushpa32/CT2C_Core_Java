package com.tns.java;

public class AbstractDemo {

	public static void main(String[] args) {
		//cannot create object for abstract class
		Scooty Activa = new Scooty(); //error: cannot initiate Scooty
		Activa.NoOfWheels();
	}
}

//abstract class Vehicle
abstract class Vehicle   //partially implemented class
{
	public abstract void NoOfWheels();
	
	public abstract void m();	
}

//abstract class Scooty class inheriting vehicle
abstract class Scooty extends Vehicle
{
	public void NoOfWheels()
	{
		System.out.println(2);
	}
}
