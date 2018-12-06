
/**
 * Purpose : This program take three string input from user and prints out a proper sentence 
 *           with the names in the reverse of the order.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.week1;

import utility.Util1;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first name");
		String name = Util1.inputString();
		System.out.println("Enter the second name");
		String name1 = Util1.inputString();
		System.out.println("Enter the third name");
		String name2 = Util1.inputString();
		System.out.print(" Hi "+ name2+", "+ name1+" and " +name);
		

	}

}
