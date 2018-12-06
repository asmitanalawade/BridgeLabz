
/**
 * Purpose : This program take a value from user and print the future value.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   1/12/2018          
 */


package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class FutureValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of dollers, rate and periode");
		double C = MathFunctions.inputDouple();
		double r = MathFunctions.inputDouple();
		double T = MathFunctions.inputDouple();
		System.out.println("Present value = " + C);
		double result = MathFunctions.futureValue(C, r, T);
		System.out.println("Future value = " + result);
	
		
		
		

	}

}
