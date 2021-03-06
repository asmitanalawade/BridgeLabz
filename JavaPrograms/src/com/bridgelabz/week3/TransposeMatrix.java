package com.bridgelabz.week3;

import utility.Utility;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the rows and columns of first matrix");
		int row = Utility.inputInt();
		int col = Utility.inputInt();
		int M[][] = new int [row][col];
		System.out.println("Enter the first matrix");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				M[i][j] = Utility.inputInt();
			}
		}
		
		System.out.println("Matrix after transpose: ");
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(M[j][i] + " ");
			}
			System.out.println();
		}
	}

}
