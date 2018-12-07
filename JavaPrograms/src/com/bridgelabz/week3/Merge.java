
/**
 * Purpose : This program take the input from the user and print the string array
 *          after merge sort.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   4/12/2018          
 */

package com.bridgelabz.week3;
import utility.Utility;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		String[] array = new String[n];
		System.out.println("Enter the String of the array");
		for(int i = 0; i < n; i++) {
			array[i] = sc.next();
			
		}
		
		Utility.sort(array, 0, n-1);
		System.out.println("Sorted array: ");
		for(int i = 0; i < n; i++) {
			System.out.println(array[i] + " ");
		}
	
		

	}
	

}
