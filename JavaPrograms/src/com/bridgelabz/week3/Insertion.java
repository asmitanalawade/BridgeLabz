
/**
 * Purpose : This program take the input from the user and print the string array
 *          after insertion sort.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   4/12/2018          
 */

package com.bridgelabz.week3;
import utility.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the string array");
		int n = sc.nextInt();
		String [] array = new String[n+1];
		Utility.insertion(n, array);
		
		
		
	}

}
