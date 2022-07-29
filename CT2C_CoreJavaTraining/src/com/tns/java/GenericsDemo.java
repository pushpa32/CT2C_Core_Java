package com.tns.java;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

		// example without generic
		List list1 = new ArrayList();
		list1.add("Hello World List 1");
		System.out.println((String) list1.get(0));// typecasting is required

		// example with the use of generic
		// we don't need to typecast the object.
		List<String> list2 = new ArrayList<String>();
		list2.add("Hello World! List 2");
		System.out.println(list2.get(0));

	}

}
