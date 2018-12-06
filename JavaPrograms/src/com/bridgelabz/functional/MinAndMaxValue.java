
/**
 * Purpose : This program take a value from user and print the maxValue and minValue from 
 *            array.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   1/12/2018          
 */

package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class MinAndMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of the array");
		int n = MathFunctions.inputInt();
		int [] array = new int[n];
		int maxValue = 0;
		int minValue = 0;
		System.out.println("Enter the elements of the array");
		
		MathFunctions.maxMinValue(n, array, maxValue, minValue);

	}

}
