
/**
 * Purpose : This program take the input from the user and print the 2D array of the 
 *          prime numbers.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   4/12/2018          
 */

package com.bridgelabz.week3;


import utility.Utility;

public class PrimeArray {

	 public static void main(String args[]){
		// TODO Auto-generated method stub
			
				int i,j,n=1000,k=0;
				boolean status = true;
				int intArray[] = new int[n];
				//Checking the number is prime number or not
				for(i=0;i<=n;i++) {
				
					for(int z=2;z<i;z++) {
					
						if(i%z==0) {
						
							status = false;
							break;
						}
						else					
							status = true;						
					}
					if(status)
					{
						System.out.print(i+" ");
						intArray[k] = i;
						k++;
					}
				}
				//Initialize rows and columns
				int a[][]=new int[10][25];
				
		
				int count=0;
			      for(i=0;i<10;i++) {
			        
			           for(j=0;j<25;j++) {
			            
			                if(count==intArray.length) 
			                	break;

			            a[i][j]=intArray[count];
			            count++;
			            }
			        }
			    System.out.println("Count is "+count);	
						
			  //taking for partition purpose
			    int pause = 100;
						
				System.out.println("2d Array :"); 
				
			    for(i=0;i<10;i++) {
		        
		           for(j=0;j<25;j++) {
		            	
		        	  
		        	   if(a[i][j]>pause) {
		                 
		                     pause=pause+100;
		                     System.out.println();
		                 }	
		        	   System.out.print(a[i][j]+" ");
		            }
		        }
									
						

		}
}
