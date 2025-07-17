package com.sample.com;

import java.util.Scanner;

public class Matrix {

	public static Scanner sc;

	public int[][] createMatrix() {
		
		System.out.println("Enter the number of Rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];

		System.out.println("Enter the matrix values: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		return matrix;
	}
	
	public int[][] addMatrix(int[][] mat1, int[][] mat2){
		
		int[][] resultMatrix = new int[mat1.length][mat2.length];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				resultMatrix[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		return resultMatrix;
	}
	
	public void viewMatrix(int[][] view) {
		
		for (int i = 0; i < view.length; i++) {
			for (int j = 0; j < view.length; j++) {
				System.out.print(view[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		Matrix mat = new Matrix();
		int[][] matA = mat.createMatrix();
		int[][] matB = mat.createMatrix();
		int[][] result = mat.addMatrix(matA, matB);
		mat.viewMatrix(result);

	}

}
