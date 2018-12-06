
/**
 * Purpose : This program take a value from user and print the maxString and minString from 
 *           string array.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   1/12/2018          
 */

package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class MinAndMaxString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the length of the string array");
		int n = MathFunctions.inputInt();
		int [] array = new int[n];
		int maxString = 0;
		int minString = 0;
		System.out.println("Enter the characters of the string array");
		for(int i = 0 ; i < n; i++) {
			array[i] = MathFunctions.inputInt();
		}
		
	}

}
