package com.tns.java;

//Class A
class A {
	int a = 10;
	   
	void aFunction()
	   {
		System.out.println(a);
	   } 
	}

//class B extends A
class B extends A{
	int b = 2;
	void bFunction()
	   {
		System.out.println(b);
	   }
	}

//class C extends B
class C extends B{
	int c = 30;

	   void cFunction()
	   {
		System.out.println(c);
	   }
	}

public class MultilevelExample {

	public static void main(String[] args) {
		
		//creating object for class C
		C obj = new C();
		obj.aFunction(); //calling function
	}

}
