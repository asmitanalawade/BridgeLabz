package com.bridgelabz.week3;
import utility.Utility;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the rows and coloumns");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		int [][] matrix = new int[m][n];
		
		System.out.println("Enter the 2D array");
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				matrix[i][j] = Utility.inputInt();
		
		//Utility.Array(m, n, matrix);




		
		
	}

}
