package com.tns.java;

public class TryCatchFinally {

	public static void main(String[] args) {
		int[] arr = new int[4];

		try {
			System.out.println(arr[4]);
			System.out.println("Inside Try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Catch");
		} finally {
			System.out.println("Inside Finally");
		}
		System.out.println("Outside try Catch");
	}

}
