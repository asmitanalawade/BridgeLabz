
/**
 * Purpose : This program compute the sin x using Taylor series expansion.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.week1;

import com.bridgelabz.functionsandlibraries.MathFunctions;

import utility.Util1;

public class SinxAndCosx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter choice : 1] find sinx" + "2] find cosx ");
		System.out.println("Enter the choice to perform the operations");
		int choice = MathFunctions.inputInt();
		
		switch(choice) {
		
		case 1 :
			 System.out.println("Enter the number of series for sin x");
			 int n = Util1.inputInt();
		     System.out.println("Enter the value of x");
		     double x = Util1.inputDouble();
		
             double result = Util1.sinx(x, n);
             System.out.println(result);
             break;
             
		case 2 :
			System.out.println("Enter the number of series for cosx");
			 int m = Util1.inputInt();
		     System.out.println("Enter the value of x");
		     double x1 = Util1.inputDouble();
		
            double result1 = Util1.cosx(x1, m);
            System.out.println(result1);
            break;
            
		}

	}

}
