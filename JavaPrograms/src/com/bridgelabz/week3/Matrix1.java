package com.bridgelabz.week3;

import utility.Utility;

public class Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the rows and columns of first matrix");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		int first[][] = new int [m][n];
		
		System.out.println("Enter the first matrix");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				first[i][j] = Utility.inputInt();
			}
		}

	}

}