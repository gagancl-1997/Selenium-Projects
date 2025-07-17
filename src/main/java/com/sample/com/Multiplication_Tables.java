package com.sample.com;

import java.util.Scanner;

public class Multiplication_Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the multiplication Table: ");
		
		int value = sc.nextInt();
		System.out.println("Multiplication Table for "+ value + " is: ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(value + " * "+ i + " = "+ (value * i));
		}
		
		System.out.println("\nSquare root of "+ value + " is: "+ Math.sqrt(value));
		
		System.out.println("Square of "+ value + " is: "+ value*value);
	}

}
