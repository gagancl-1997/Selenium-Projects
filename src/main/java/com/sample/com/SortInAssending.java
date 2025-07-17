package com.sample.com;

import java.util.Scanner;

public class SortInAssending {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int value = sc.nextInt();

		int[] arr = new int[value];

		System.out.println("Enter array values: ");
		for (int i = 0; i < value; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Value Before Swapping: ");
		for (int i = 0; i < value; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		for (int i = 0; i < value; i++) {
			for(int j = 0; j < value; j++) {
				if(arr[i] <= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Value After Swapping: ");
		for (int i = 0; i < value; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
