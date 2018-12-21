package com.bridgelabz.week5;

import java.util.Scanner;

public class BankingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount");
		int amount = sc.nextInt();
		System.out.println("Enter the number of people");
		int people = sc.nextInt();
		Queue queue = new Queue();
		
		for(int i = 1; i <= people; i++) {
			
			queue.enqueue(i);
			
		}
		// queue.show();
			
		  for(int i=1; i <= people; i++) { 
			  
			System.out.println("Number of people: " + i);
			  
			  System.out.println("press 1:To deposit your amount");
		
			  System.out.println("press 2:To withdraw your amount");
		
		 
			  int choice = sc.nextInt();
		  
		   if(choice == 1) {
			
			      System.out.println("Enter the deposit amount");
			      int deposit = sc.nextInt();
			      amount = amount + deposit;
			      System.out.println("Total amount in bank" + amount);
			      
			      queue.dequeue();
			 }
		     // queue.show();
		      
		    if(choice == 2) {
		    	System.out.println("Enter the withdraw amount");
		    	int cash = sc.nextInt();
		    	if(cash > amount) {
		    		System.out.println("Insufficient balance in your account");
		    	}
		    	
		    	amount = amount - cash;
		    	System.out.println("Total amount in bank " + amount);
		    	
		    	  queue.dequeue();
		    }
		}
		  
		    // queue.show();
		
	}

}
