
/**
 * Purpose : This program take three double numbers from user and print the double operations.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */


package com.bridgelabz.week1;

import utility.Util1;

public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of a: ");
		double a = Util1.inputDouble();
		System.out.println("Enter the value of b: ");
		double b = Util1.inputDouble();
		System.out.println("Enter the value of c: ");
		Double c = Util1.inputDouble();
	    
		System.out.println("a+b*c = " + ((a+b)*c));
		System.out.println("a*b+c = " + ((a*b)+c));
		System.out.println("c+a/b = " + ((c+a)/b));
		System.out.println("a%b+c = " + ((a%b)+c));

	}

}
