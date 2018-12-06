
/**
 * Purpose : This program take three integer numbers from user and print the operations .
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.week1;

import utility.Util1;

public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of a: ");
		int a = Util1.inputInt();
		System.out.println("Enter the value of b: ");
		int b = Util1.inputInt();
		System.out.println("Enter the value of c: ");
		int c = Util1.inputInt();
		
		System.out.println("a+b*c = " + ((a+b)*c));
		System.out.println("a*b+c = " + ((a*b)+c));
		System.out.println("c+a/b = " + ((c+a)/b));
		System.out.println("a%b+c = " + ((a%b)+c));

	}

}
