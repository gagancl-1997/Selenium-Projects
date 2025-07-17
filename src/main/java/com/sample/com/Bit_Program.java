package com.sample.com;

import java.util.Scanner;

public class Bit_Program {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of Names to add: ");
		int numOfNames = sc.nextInt();
		String[] names = new String[numOfNames];

		System.out.println("Enter " + numOfNames + " names: ");
//		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		
		System.out.println();

		for (int i = 0; i < names.length; i++) {
			if (i == 0 || i == numOfNames - 1) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println();
		
		for(String lv : names) {
			System.out.println(lv);
		}

	}

}
