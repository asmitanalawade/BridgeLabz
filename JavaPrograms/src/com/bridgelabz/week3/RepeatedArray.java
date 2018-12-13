package com.bridgelabz.week3;

import utility.Util1;

public class RepeatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of array : ");
		int n = Util1.inputInt();
		int array[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < n; i++) {
			array[i] = Util1.inputInt();
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				//Compare two array
				if(array[i] == array[j])
					System.out.println("Repeat number is\n: " + array[j]);
				
				
			}
		}
		

	}

}
