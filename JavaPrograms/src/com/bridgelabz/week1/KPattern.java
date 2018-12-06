
/**
 * Purpose : This program take row input from user and print the upperCase KDW using asterisk 
 *           pattern.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   28/11/2018          
 */

package com.bridgelabz.week1;
//import java.util.Scanner;


import utility.Util1;

public class KPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		String name = Util1.inputString();
		
		int flag = Util1.initial(name);
		if(flag == 0) {
			System.out.println("This is invalid input...try again...");
		}
	

	}

}
