
/**
 * Purpose : This program take input from user n and asks you to think of a number 
 * between 0 and N­1, where N = 2^n, and always guesses the answer with n questions..
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   4/12/2018          
 */

package com.bridgelabz.week3;

import utility.Utility;

public class BinaryInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		int a = Utility.inputInt();
		//Take the power of 2^a
	    int n = (int) Math.pow(2, a);
	    
//		int power = 1;
//		for(int i = 1; i < n-1; i++) {
//			power = power * 2;
//			System.out.println("Power of 2^" + i + " = " + power);
//		}
//	    int array[] = new int[n];
//		for(int i = 0;i <= n-1; i++) {
//			array[i] = i;
//			System.out.println("Integer array is: " + array[i]);
//		}
//		System.out.println("Enter the word you want to search from array");
//		int b =
				//Utility.binaryInteger(n, a);
		
	    int low = 0;
		int high = n-1; 
		//int mid = (high + low)/2;
		Utility.find(low, high);
		

	}



}
