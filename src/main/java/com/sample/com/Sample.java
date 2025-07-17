package com.sample.com;

public class Sample {
	
	public static void main(String args[]) {
		int n = 5;
		int arr[] = new int[n+1];
		for(int i=1; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
