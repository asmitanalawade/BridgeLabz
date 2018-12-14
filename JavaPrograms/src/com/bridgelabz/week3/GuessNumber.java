package com.bridgelabz.week3;

import java.util.Scanner;

import com.bridgelabz.week1.Random;
import utility.Utility;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random random = new Random();
	     // Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the number");
	      int a = Utility.inputInt();
		  int n = (int) (Math.pow(2, a));
		  //int number = 50;
	      //int number = (int)(Math.random()*(50 + 1));	
//	      int min = 0;
//	      int max = number-1;
//	      int guess = -1;
//	      int count=0;
//	 
//	      while (guess!=number) {
//	         count=count+1;
//	         System.out.println("Enter a number between" + min+ " and " + max);
//	         guess = Utility.inputInt();
//	         if (guess < number) {
//	            System.out.println("Too low, please try again");
//	         } else if (guess>number) {
//	            System.out.println("Too high, please try again");
//	         } else {
//	            System.out.println("Correct, the number was " + number);
//	         }
//	      }
//	      System.out.println("It took you " + count + " trys.");
		  
		  System.out.println("Imagine number between 0 to " +n);
	    	int min=0;
	    	int max=n;
	    	int guess=min+max/2;
	    	char input=' ';
	    	int tries=1;
	    	if(max>=min) {
	    		while(input !='y') {
	    			
	    			System.out.println("Is your number"+guess+"?");
	    			System.out.println("yes/no");
	    			input=Utility.inputString().charAt(0);
	    			if(input == 'n')
	    			{
	    			System.out.println("h.Is your number higher than "+ guess+"?");
	    			System.out.println("l.Is your number lower than "+ guess+"?");
	    			input=Utility.inputString().charAt(0);
	    			if(input=='h')
	        		{
	        		    min=guess;
	        		    guess=(max+min)/2;
	        		    tries++;
	        		}
	        		else if(input=='l') {
	        			max=guess;
	        			guess=(max+min)/2;
	        			tries++;
	            	}
	    			}
	    		
	          
	    	    }
	    		}
	    	System.out.println("Number of tries "+guess);
	    	

		   
		    
	}

}
