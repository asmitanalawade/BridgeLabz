
/**
 * Purpose : This program take the string input from the user and print the frequency
 *          count of string.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   6/12/2018          
 */

package com.bridgelabz.week3;

import utility.Utility;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sring");
		String str = Utility.inputString();
		
	 // String str = " To Be Or Not To Be ";
	  //Split the words in array
	  String [] array = str.split(" ");
	  
	  for(int i = 0; i < array.length; i++) {
		 System.out.println(array[i]);
	  }
	//Sorting the array 
	  for(int i = 0; i < array.length; i++) {
		  for(int j = i + 1; j < array.length; j++) {
			
			  if(array[i].compareTo(array[j]) < 0){
				  String temp = array[i];
				  array[i] = array[j];
				  array[j] = temp;
			  }
		  }
		 
	  }
	  System.out.println("After sorting array : ");
	  for(int i = 0; i < array.length; i++) {
		  System.out.println(array[i]); 
	  }
	//Initialize the counter
	//initialize counter by 1
      int count = 1;
     
      //compare elements in array
      for(int i=0; i<array.length-1; i++) {
         
          for(int j=i+1 ; j< array.length; j++) {
        	  
        	  //If array[i] and array[j] are equal then count increment
             if(array[i].equals(array[j])) { 
                 
                  count++;
                 
                  array[j] = "0"; //replace the repeated string by 0
              }
             
          }
          if(array[i] != "0") { //if whole string is not 0 print current count
         
              System.out.println(array[i] + "-" + count);
              count = 1; //again initialize the count by 1 for next occurrence of word
             
          }
      }
	}
	

}
