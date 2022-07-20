package com.tns.interfaces;

public class MultipleInheritanceDemo implements FirstInterface, SecondInterface {

	public static void main(String[] args) {
		System.out.println(laptopbrand);
		System.out.println(laptopCOlor);

		// Method Calls
		MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
		obj.documentation();
		obj.paint();
		obj.browsing();
		obj.programming();

	}

	@Override
	public void documentation() {
		System.out.println("Documentation is here");

	}

	@Override
	public void paint() {
		System.out.println("Paint is here");

	}

	@Override
	public void programming() {
		System.out.println("Programming is here");

	}

	@Override
	public void browsing() {
		System.out.println("Browsing is here");

	}

}
