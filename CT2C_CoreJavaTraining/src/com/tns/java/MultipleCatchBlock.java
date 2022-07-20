package com.tns.java;

//Java demonstrate of multiple catch program
public class MultipleCatchBlock {

	public static void main(String[] args) {
		// try clock
		try {
			int a[] = new int[5];
			System.out.println(a[6]);
//			a[5] = 30 / 0;
		}
		// catch blocks
		catch (ArithmeticException e) { // Arithmetic Exception
			System.out.println("Arithmetic");
		} catch (ArrayIndexOutOfBoundsException e) { // Array bound Exception
			System.out.println("ArrayIndexOutOfBounds");
		} catch (Exception e) { // Parent Exception
			System.out.println("Exception occurs");
		}

		// Out of try catch
		System.out.println("Out of try catch");
	}

}
