
/**
 * Purpose : This program take input from user n and print the integer numbers after 
 *           the bubble sort .
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   3/12/2018          
 */

package com.bridgelabz.week3;
import utility.Utility;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		Utility.bubble(n, array);
		
	}

}
