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
		  int number = (int) Math.pow(2, a);
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
		  
		  System.out.println("Think of a number between 0 and " + (number-1) );
            int min = 0;
		    int max = number;
		    int guess = (max+min)/2;
		    int tries = 0;
		    int input = 0;
		    while(input!=2)
	        {
	            System.out.println("\nIs your number "+ guess +"...??\n");
	           
	            System.out.println("Press 1:Is your number between " +min+ " and" +(guess-1)+ "\n");
	           
	            System.out.println("Press 2:Yes, this is your number\n");
	           
	            System.out.println("Press 3:Is your number between " +(guess+1)+ " and " +(max-1)+ "\n");
	           
	            input = Utility.inputInt();
	           
	            if(input == 1)
	            {
	                max = guess;
	               
	                guess = min + (guess-min)/2;
	               
	                tries++;
	            }
	            else if(input == 3) 
	            {
	                min = guess;
	               
	                guess = guess + (max - guess)/2;
	               
	                tries++;
	            }
	        }
	       
	        System.out.println("It took "+ tries + " tries to guess "+ guess);
		    
		    
		   
		    
	}

}
