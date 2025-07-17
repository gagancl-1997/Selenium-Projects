package com.sample.com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = 2;
		boolean flag = false;

		System.out.println("Enter the Number Range: ");

		int range = scanner.nextInt();

		if (range == 0 || range == 1) {
			System.out.println("Not a Prime Number");
		}

		while (i <= range / 2) {
			if (range % i == 0) {
				flag = true;
				break;
			}
			++i;
		}

		if (flag) {
			System.out.println(range + " is not a Prime Number");
		} else {
			System.out.println(range + " is a Prime Number");
		}

	}

}
