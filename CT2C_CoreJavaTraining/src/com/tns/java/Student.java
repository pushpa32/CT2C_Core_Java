package com.tns.java;

public class Student {
	
	//declaring variables
	String name;
	int roll,age;
	
	//Constructor
	public Student(String name, int roll, int age) 
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	
	public static void main(String[] args) {
		//creating two objects of same class
		Student s1= new Student("Avantika",1,29);
		Student s2=new Student("Shalini",2, 15);
		
		//print the result of the variables's values
		System.out.println(s1.name+" "+ s1.roll+" "+ s1.age);
		System.out.println(s2.name+" "+ s2.roll+" "+ s2.age);

	}

}
