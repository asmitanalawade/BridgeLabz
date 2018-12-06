
/**
 * Purpose : This program  take input from user and print 1)harmonic number 2) decimal to binary number
 *           3) sin of an angle and 4) cosine of an angle.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   30/11/2018          
 */

package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

import utility.Util1;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter choice: 1] print the harmonics series\n"
				                       + "2]print binary number\n"
				                       + " 3] print sinx using Taylor series\n"
				                       + " 4] print cosx using Taylor series\n");
		
		System.out.println("Enter the choice to perform the operations");
		
		int choice = MathFunctions.inputInt();
		
		
		switch(choice){
		
		case 1 :
			  System.out.println("Enter the number for harmonic series");
		      int n = MathFunctions.inputInt();
              double sum = 0;
              double result = MathFunctions.harmonics(n, sum);
              System.out.println("Value of the harmonic series is : "+ result);
              break;
		case 2:
			 System.out.println("Enter the decimal number");
			 int dec = MathFunctions.inputInt();
			 int i = 1;
			 int j = i-1;
			 int [] bin_num =new int[100];
			 MathFunctions.binary(dec, i, j, bin_num);
			 break;
			 
		case 3 :
			 System.out.println("Enter the number of series for sin x");
			 int n1 = Util1.inputInt();
		     System.out.println("Enter the value of x");
		     double x = Util1.inputDouble();
		
             double result1 = Util1.sinx(x, n1);
             System.out.println(result1);
             break;
            
		case 4 :
			System.out.println("Enter the number of series for cosx");
			 int m = Util1.inputInt();
		     System.out.println("Enter the value of x");
		     double x1 = Util1.inputDouble();
		
             double result2 = Util1.cosx(x1, m);
             System.out.println(result2);
             break; 
		}
	}
	
}
