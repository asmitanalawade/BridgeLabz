package com.bridgelabz.functional;
import utility.Utility;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the rows and coloumns");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		int [][] matrix = new int[m][n];
		
		Utility.Array(m, n, matrix);




		
		
	}

}
