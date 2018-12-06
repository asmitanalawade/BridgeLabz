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
