package com.sample.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortWithCollections {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the size of the array: ");
//		int size = sc.nextInt();
//		
//		int[] arr = new int[size];
//		
//		System.out.println("Enter the array values: ");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		Arrays.sort(arr);
//				
//		System.out.println("After sorting: \n"+ Arrays.toString(arr));
	
		int a = 10, b = 20;
		Integer ab = (Integer)a;
		Integer bc = (Integer)b;
		
		System.out.println("sum of a+b = "+ (a+b));
		System.out.println("Sum of ab+bc = "+ bc+ab);
		
		String a1 = "10";
		String a2 = "20";
		
		System.out.println("Before Parsing String: "+ (a1+a2));
		
		int inta1 = Integer.parseInt(a1);
		int inta2 = Integer.parseInt(a2);
		
		int sum = inta1+inta2;
		System.out.println("After Parsing String: "+ sum );
		
	}
	
}
