package com.sample.com;

import java.util.Scanner;

public class reverceString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String name = scanner.nextLine();
		
//		StringBuffer sb = new StringBuffer(name);
//		System.out.print(sb.reverse()+"\n");
		
		char[] charArray = name.toCharArray();

		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
