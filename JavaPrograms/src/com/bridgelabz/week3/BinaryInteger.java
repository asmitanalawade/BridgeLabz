package com.bridgelabz.week3;

import utility.Utility;

public class BinaryInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		int a = Utility.inputInt();
	    int n = (int) Math.pow(2, a);
//		int power = 1;
//		for(int i = 1; i < n-1; i++) {
//			power = power * 2;
//			System.out.println("Power of 2^" + i + " = " + power);
//		}
	    int array[] = new int[n];
		for(int i = 0;i <= n-1; i++) {
			array[i] = i;
			System.out.println("Integer array is: " + array[i]);
		}
		System.out.println("Enter the word you want to search from array");
		int b = Utility.inputInt();
		Utility.binaryInteger(n, array, b);

	}

}
