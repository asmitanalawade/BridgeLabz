package com.bridgelabz.week3;

import utility.Utility;

public class MatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the rows and columns of first matrix");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		int first[][] = new int [m][n];
		System.out.println("Enter the first matrix");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				first[i][j] = Utility.inputInt();
			}
		}
		
		System.out.println("Enter the rows and columns of second matrix");
		int p = Utility.inputInt();
		int q = Utility.inputInt();
		
		if(n != p) {
			System.out.println("The two matrices can't multiplied");
		}else {
			int second[][] = new int[p][q]; 
			int multiply[][] = new int [m][q];
			
			
			 System.out.println("Enter elements of second matrix");
			 int c,d=0,k;
			 int sum = 0;
	         for (c = 0; c < p; c++) {
	            for (d = 0; d < q; d++) {
	               second[c][d] = Utility.inputInt();
	            }
	         }  
	         for (c = 0; c < m; c++)
	         {
	            for (d = 0; d < q; d++)
	            {  
	               for (k = 0; k < p; k++)
	               {
	                  sum = sum + first[c][k]*second[k][d];
	                  //System.out.println(sum);
	               }
	 
	               multiply[c][d] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product of the matrices:");
	                                         
	         for (c = 0; c < m; c++)
	         {
	            for (d = 0; d < q; d++) {
	               System.out.print(multiply[c][d]+"\t");
	            }
	            System.out.print("\n");
	         }
		}
		
	       if(q != m) {
	    	   System.out.println("The two matrices can't multiplied");
	       }else {
	    	   int second[][] = new int[p][q]; 
	    	   int third[][] = new int[p][q]; 
	    	   int multiply1[][] = new int[p][n];
	    	  // System.out.println("Enter elements of second matrix");
				 int c,d=0,k;
				 int sum = 0;
		         for (c = 0; c < p; c++) {
		            for (d = 0; d < q; d++) {
		               third[c][d] = second[c][d];
		            }
		         }  
	    	  
	         for (c = 0; c < p; c++)
	         {
	            for (d = 0; d < n; d++)
	            {  
	               for (k = 0; k < m; k++)
	               {
	                  sum = sum + second[c][k]*first[k][d];
	                  //System.out.println(sum);
	               }
	 
	               multiply1[c][d] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product1 of the matrices:");
	 
	         for (c = 0; c < p; c++)
	         {
	            for (d = 0; d < n; d++) {
	               System.out.print(multiply1[c][d]+"\t");
	            }
	            System.out.print("\n");
	      }
	         
//	         if(multiply[c][d] == multiply1[c][d]) 
//	        	 System.out.println("Product of two matrices are same");
//	         else 
//	        	 System.out.println("Product of two matrices are not same");
	         
	
		
		}

	}

}
