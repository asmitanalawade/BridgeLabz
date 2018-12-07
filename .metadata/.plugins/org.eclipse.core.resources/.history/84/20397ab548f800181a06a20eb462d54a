
/**
 * Purpose : This program  print the string operations such as a 1)Check the given two strings are anagram or not "
				 2] Check the given string is palindrome or not 
				 3] Find all permutation of a String using recursion method
				 4] Find all permutation of a String using Iterative method .
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   30/11/2018          
 */

package com.bridgelabz.functional;
import java.util.Arrays;

import com.bridgelabz.functionsandlibraries.StringFunctions;

import utility.Utility;;
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter 1] Check the given two strings are anagram or not "
				+ "\n 2] Check the given string is palindrome or not "
				 + "\n 3] Find all permutation of a String using recursion method"
				 + "\n 4] Find all permutation of a String using Iterative method" );
		
		System.out.println("Enter your choice to perform the string operations");
		int choice = StringFunctions.inputInt();
		
		
		  switch(choice) {
		
		   case 1 :
			   System.out.println("Enetr the strings for anagram");
			      String str1 = StringFunctions.inputstr();
			      int n = str1.length();
			      System.out.println("Enter the strings for anagram");
			      String str2 = StringFunctions.inputstr();
		     
              System.out.println("");
		     StringFunctions.Anagram(str1, str2);
		       break;
		       
		   case 2 :     
		      System.out.println("Enter the string for palindrome");
		      String str= StringFunctions.inputstr();
		      StringFunctions.Palindrom(str);
		       break; 
		       
		    case 3 :
		      System.out.println("Enter the string for permutation using recursion method");
		      String str3 = StringFunctions.inputstr();
		      int n1 = str3.length();
		      StringFunctions.PermuRecursive(str3, 0, n1-1);
		      break;
		      
		      
		    default :
		    	   System.out.println("Invalid input");
		     
		  }
			  
	}
	
}
