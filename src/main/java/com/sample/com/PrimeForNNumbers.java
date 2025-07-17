package com.sample.com;

import java.util.Scanner;

public class PrimeForNNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int num = scanner.nextInt();
		int baseNum = 2;
		System.out.println("0 is not a prime number");
		System.out.println("1 is not a prime number");
		for (int i = 2; i < num; i++) {
			while (baseNum <= i / 2) {
				if (i % baseNum == 0) {
					System.out.println(i + " is not Prime Number");
					break;
				}
				++baseNum;
			}
			System.out.println(i + " is a prime number");
		}
	}
}
