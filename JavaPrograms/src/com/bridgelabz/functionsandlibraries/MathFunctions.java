package com.bridgelabz.functionsandlibraries;

import java.util.Scanner;

import utility.Util1;

public class MathFunctions {
	// Take input integer from user
	static Scanner sc = new Scanner(System.in);
	public static int inputInt() {
		return sc.nextInt();
	}
	// Take double value from user
	public static double inputDouple() {
		return sc.nextDouble();
	}
	// Take string from user
	public static String inputstr() {
		return sc.next();
	}

//*********************************************************************************************
	public static double harmonics(int n, double sum) {
		 System.out.println("Harmonic series is: ");
		 //Take condition for n is greater than 0 
	        while(n > 0) {
	        	
	        	sum = sum + (double)1/n;
	        	n--;
	        	System.out.println(" " + sum);
	        }
	       System.out.println(" ");
	      return sum;
	}
	//*****************************************************
	public static void binary(int dec, int i, int j, int bin_num[]) {
	 while(dec != 0) {
			bin_num[i++] = dec % 2;
			dec /= 2;
		}
		
		System.out.println("Binary number is: ");
		//Print binary number in reverse
		for(j = i -1; j > 0; j--) {
			System.out.print(bin_num[j]);
		}
		System.out.println("\n");
	}
	//******************************************************
	
	 public static double sinx(double x, int n1) {
			// convert x to an angle between -2 PI and 2 PI
		         x = x * (Math.PI/180);
	           System.out.println("x = " + x);
		        // compute the Taylor series approximation
		        double term = 1.0;      // ith term = x^i / i!
		        double sum  = 0.0;      // sum of first i terms in taylor series
	            
		        for (int i = 1; i <= n1; i++) {
		        	if(term != 0) {
		        		if(i % 2 == 1) {
		        	  double numerator = Math.pow(x, i);
		        	  System.out.println("Numerator: " + numerator);
		        	  double denominator = Util1.factorial(i);
		        	  System.out.println("Denominator: " + denominator);
		              term = term * (numerator / denominator);
		        		}
		              if (i % 4 == 1) 
		               	sum = sum + term;
		              if (i % 4 == 3) 
		            	sum = sum - term;
		             
		        	}
		        }
		        return sum;
		 }
		 
		 //********************************************************
		 
		 public static double cosx(double x1, int m) {
			// convert x to an angle between -2 PI and 2 PI
	         x1 = x1 * (Math.PI/180);
	       System.out.println("x1 = " + x1);
	        // compute the Taylor series approximation
	        double term = 1.0;      // ith term = x^i / i!
	        double sum  = 0.0;      // sum of first i terms in taylor series
	        
	        for (int i = 0; i <= m; i++) {
	        	if(term != 0) {
	        		if(i % 2 == 0) {
	        	  double numerator = Math.pow(x1, i);
	        	  System.out.println("Numerator: " + numerator);
	        	  double denominator = Util1.factorial(i);
	        	  System.out.println("Denominator: " + denominator);
	              term = term * (numerator / denominator);
	        		}
	              if (i % 4 == 0) 
	               	sum = sum + term;
	              if (i % 4 == 2) 
	            	sum = sum - term;
	             
	        	}
	        }
	        return sum;
			 
		 }
		//********************************************************* 
		 public static double factorial(int n) {
			 int factorial = 1;
	         for(int i = 1; i <= n; i++ ) {
				
				factorial = factorial * i;
				
				
				
			}
		     
		      return factorial;
		}

//**********************************************************************************************
	
	public static void prinum(int n) {
		for(int i = 0; i < n; i++) {
			boolean status = true;
			for(int j= 2; j < i; j++) {
				//Check the condition for prime number
				while(i % j == 0) {
				  status = false;
				  break;
				}
			}
			if(status) {
				System.out.println(" " + i);
			}
		}
	}

//*********************************************************************************************
	
	public static long factor(int n, long factor) {
         for(int i = 1; i <= n; i++ ) {
			
			factor = factor * i;
			
			System.out.println(" " + i);  
			
		}
		return factor;
	}

	
	
//**********************************************************************************************
	
	public static double futureValue(double C,double r, double T) {
		
		double futureValue = C * (1 + r)*Math.sqrt(T);
		
		return futureValue;
	}
	
//**********************************************************************************************
	
	public static double presentValue(double C,double r, double T) {
		
		double presentValue = C/(1 + r)*Math.sqrt(T);
		
		return presentValue;
	}
//***********************************************************************************************
	
	public static void slope(int x1, int x2, int x3, int y1, int y2, int y3) {
		
		int slopeAB = (y2 - y1)/(x2 - x1);
		int slopeBC = (y3 - y2)/(x3 - x2);
		int slopeAC = (y3 - y1)/(x3 - x1);
		
		if(slopeAB == slopeBC && slopeBC == slopeAC) {
			System.out.println("The points are collinear");
		}else {
			System.out.println("The points are not collinear");
		}
       
	}
     //********************************************************************
	
	
	public static void area(int x1, int x2, int x3, int y1, int y2, int y3) {
		
		int triArea = (int)0.5*((x1 - x2)*(y2 - y3) - (x2 - x3)*(y1 - y2));
		if(triArea == 0) {
			System.out.println("The points are collinear");
		}else {
			System.out.println("The points are not collinear");
		}
	}
//*********************************************************************************************
	public static void maxMinValue(int n, int[] array, int maxValue, int minValue) {
		
		for(int i = 0 ; i < n; i++) {
			array[i] = MathFunctions.inputInt();
		}
		for(int i = 0; i < n; i++) {
			if(array[i] > n) 
				maxValue = array[i];
			else if(array[i] < n)
				minValue = array[i];
				
		}
		System.out.println("Maximum value is = " + maxValue);
		System.out.println("Minimum value is = " + minValue);
	}
	
}
