
/**
 * Purpose : This program take input from user rows,columns and print the 2D array for
 *           integer, double and boolean value.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   3/12/2018          
 */


package com.bridgelabz.week3;
import utility.Utility;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take input from user rows and columns
		System.out.println("Enter the rows and columns");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		int array[][] = new int[m][n];
		Utility.arrayaIntDou(m, n, array);


		
		
	}

}
