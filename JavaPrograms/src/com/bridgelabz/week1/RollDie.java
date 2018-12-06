
/**
 * Purpose : This program take n input from user and print which number between 1 and 6 fall 
 *           maximum number of times.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   29/11/2018          
 */

package com.bridgelabz.week1;

import utility.Util1;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      System.out.println("Enter the number of times to roll the dice :");
			
			int n = Util1.inputInt();
			
			int arr[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) {
			
				int random = (int)(Math.random()*6)+1;
				
				if(random > 1 || random < 6)
				{
					arr[i]=random;
				}
				
				System.out.println(arr[i]);
			}
			
			
			
			int num = Util1.checkRepeated(arr, n);
			System.out.println("Repeated numbers = " +num);
		}
		
	
	
			
			
		
		
		

	}


