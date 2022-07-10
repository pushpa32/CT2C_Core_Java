package com.tns.assessment;
import java.util.Scanner;
public class OddEven {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is an even Number");
        else
            System.out.println(num + " is an odd number");

	}

}


