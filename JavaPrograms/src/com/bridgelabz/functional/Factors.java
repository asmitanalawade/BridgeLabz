package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		long factor = 1;
		
		
		long result = MathFunctions.factor(n, factor);
		System.out.println("Factorial of " + n + " are = " + result);

	}

}
