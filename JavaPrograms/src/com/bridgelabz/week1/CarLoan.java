
/**
 * Purpose : This program take three input from user i.e P, Y and R and calculate the monthly 
 *           payment using formula.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   28/11/2018          
 */




package com.bridgelabz.week1;
import utility.Util1;


public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Take a input from user in principal, rate and year
		System.out.println("Enter the values of principal , rate and year");
		double principal = Util1.inputDouble();
		double rate = Util1.inputDouble();
		double year = Util1.inputDouble();
		double result = Util1.Payment(principal, rate, year);
		//Print the monthly payment
		System.out.println("Monthly payment = " + result);
		
		
		
	}

}
