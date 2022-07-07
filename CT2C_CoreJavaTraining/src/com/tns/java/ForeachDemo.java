package com.tns.java;

public class ForeachDemo {
	public static void main(String[] args) {

		//initiating array
		int[][] x= {{10,20,30,40},{50,60}};
		
		//printing array elements with a loop
		for (int[] x1:x)
			for (int x2: x1)
				System.out.println(x2);

	}

}
