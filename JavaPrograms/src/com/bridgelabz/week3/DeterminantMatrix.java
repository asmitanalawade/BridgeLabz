package com.bridgelabz.week3;

import utility.Utility;

public class DeterminantMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the rows and columns of first matrix");
		int m = Utility.inputInt();
		int n = Utility.inputInt();
		int N[][] = new int [m][n];
		System.out.println("Enter the first matrix");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				N[i][j] = Utility.inputInt();
			}
		}
		 //int a = N[0][0]*N[1][1]-N[0][1]*N[1][0];
		 //System.out.println(" " + a);
		// int b = N[0][1]*N[1][2]-N[0][2]*N[1][1];
		// System.out.println(" " + b);
		 int c = N[1][0]*N[2][1]-N[1][1]*N[2][0];
		 int x = N[1][0]*N[2][2]-N[1][2]*N[2][0];
		 //System.out.println(" " + c);
		 int d = N[1][1]*N[2][2]-N[1][2]*N[2][1];
		// System.out.println(" " + d);
		 
//		 int M[][] = new int[2][2];
//		 M[0][0]=a;
//		 M[0][1]=b;
//		 M[1][0]=c;
//		 M[1][1]=d;
//		 System.out.println("Result in 2d array ");
//		 
//		 for(int p = 0; p < 2; p++) {
//			 for(int q = 0; q < 2; q++) {
//				 System.out.print( M[p][q] + " ");
//			 }
//			 System.out.println();
//		 }
		 
		 int Sign = (int)(Math.pow(1,1+(N[0][0])+1));
		 System.out.println(Sign);
//		 int determinant = M[0][0]*M[1][1]-M[0][1]*M[1][0];
//		 System.out.println("Detreminant of M matrix: " + determinant);
		 N[0][0] = (int) (N[0][0]*d);
		 System.out.println(N[0][0]);
		  
		 int Sign1 = (int)(Math.pow(-1,1+(N[0][1])+1));
		 System.out.println(Sign1);
		 N[0][1] = (int) (N[0][1]*x);
		 System.out.println(N[0][1]);
		 
		 int Sign2 = (int)(Math.pow(1,1+(N[0][2])+1));
		 System.out.println(Sign2);
		 N[0][2] = (int) (N[0][2]*c);
		 System.out.println(N[0][2]);
		 
		 int Determinant = N[0][0]-N[0][1]+N[0][2];
		 System.out.println("Determinant of N matrix is: " + Determinant);
	}

}
