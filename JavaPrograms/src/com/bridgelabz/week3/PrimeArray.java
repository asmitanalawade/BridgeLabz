
/**
 * Purpose : This program take the input from the user and print the 2D array of the 
 *          prime numbers.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   4/12/2018          
 */

package com.bridgelabz.week3;

import java.io.*;



import utility.Utility;

public class PrimeArray {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//FillPrime ob = new FillPrime();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the rows and colums");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		
		int A[][]  = new int[m][n];
		int B[] = new int[m*n];
		
		int i = 0;
		int j = 0; 
		int k = 1;
		while(i < m*n) {
			if(isPrime(k) == true) {
			  B[i] = k;
			  i++;
			}
			k++;
		}
		int x = 0;
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				A[i][j] = B[x];
				x++;
			}
		}
		System.out.println("Enter the 2D array: ");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.println(A[i][j] + "\t");
			}
		}
		System.out.println();
		
		
	}
	public static boolean isPrime(int n) {
		boolean status = false;
		for(int i = 1; i < 1000; i++) {
			while(1000 % i  == 0) {
				n++;
			}
			if(n == 2) {
				System.out.println(i + " ");
			}
		}
		return status;
		
		}


}
