package com.bridgelabz.week3;

import utility.Utility;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalNum = 22;
		int displayPerLine = 10;
		int count = 1;
		int number = 2;
		
		
		System.out.println("Prime Palindrome numbers are: ");
		while(count < totalNum) {
		  if(isPrime(number) && isPalindrome(number)){
			 
			 System.out.print(number + " ");
			    if(count % displayPerLine == 0) 
			      System.out.println();
			       count++;
			}
		number++;
		}
		
		
		
		
	}	
	public static boolean isPrime(int n) {
		
		if(n == 2) {
			return true;
		}
		//for(int i = 0; i < 1000; i++) {
	
			for(int j = 2; j < n/2; j++) {
				if(n % j == 0) 
					
					return false;
				
			}
			
		
		return true;
	}
	public static int reverse(int n){
		//int digit = 0;
		
		int reverseNum = 0;
		while(n != 0) {
			
		   int digit = n % 10;
			reverseNum = reverseNum * 10 + digit;
			n = n/ 10;
		}
		return reverseNum;
	}
	public static boolean isPalindrome(int n) {
		
		return n == reverse(n); 
	}

	

}
