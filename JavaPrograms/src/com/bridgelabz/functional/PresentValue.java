
/**
 * Purpose : This program take a value from user and print the present value.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   1/12/2018          
 */

package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class PresentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of dollers, rate and periode");
		double C = MathFunctions.inputInt();
		double r = MathFunctions.inputInt();
		double T = MathFunctions.inputInt();
		System.out.println("After investing money  = " + C);
		
		double result = MathFunctions.presentValue(C, r, T);
		System.out.println("Present value = " + result);

	}

}
