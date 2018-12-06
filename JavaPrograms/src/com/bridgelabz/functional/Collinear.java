


package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class Collinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the points");
		int x1 = MathFunctions.inputInt();
		int x2 = MathFunctions.inputInt();
		int x3 = MathFunctions.inputInt();
		int y1 = MathFunctions.inputInt();
		int y2 = MathFunctions.inputInt();
		int y3 = MathFunctions.inputInt();
		
		MathFunctions.slope(x1, x2, x3, y1, y2, y3);
		MathFunctions.area(x1, x2, x3, y1, y2, y3);

	}

}
