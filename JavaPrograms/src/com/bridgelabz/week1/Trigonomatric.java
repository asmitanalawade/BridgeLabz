
/**
 * Purpose : This program take the input from user in degree and print the trigonomatric 
 *           functions.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.week1;
import utility.Util1;

 class Trigonomatric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of angle in degree");
		double degree = Util1.inputDouble();
		double result = Util1.Triag(degree);
		
		System.out.println("sin("+ degree +") = " + result);	

	}

}
