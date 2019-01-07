package com.bridgelabz.functionsandlibraries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {
	static Scanner sc = new Scanner(System.in);
	public static int inputInt() {
		return sc.nextInt();
	}
	
	public static double InputDouble() {
		return sc.nextDouble();
	}
	public static String inputstr() {
		return sc.next();
	}
	
//*********************************************************************************************
	
	public static void Anagram(String str1,String str2) {
		//replace the str1 and str2
		String s1 = str1.replaceAll("\\n", " ");
		String s2 = str2.replaceAll("\\n", " ");
		boolean status = true;
		//Check the length of two string are not equal then false
		if(s1.length() != s2.length()) {
		  status = false;
			
		}else {
	
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			//Sorting the array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array,s2Array);
			
		}
		if(status) {
			System.out.println(s1 + " and " + s2 + " is a Anagram");
		}else {
			System.out.println(s1 + " and " + s2 + " is not Anagram");
		}
	}
	//*********************************************************************
	public static void Palindrom(String str) {
		String reverse = "";
		int n = str.length();
		//Check the condition for reverse string
	    for(int i = n-1; i >= 0; i--) 
	    	reverse = reverse + str.charAt(i);
	    
	    if (str.equals(reverse)) 
	         System.out.println("The string is a palindrome.");
	       else 
	         System.out.println("The string isn't a palindrome.");
	    
	    
	}
    //*********************************************************************
	public static void PermuRecursive(String str3, int s, int e) {
		  // Check condition for start and end are equal
			if(s == e) {
				System.out.println(str3);
			}else {
				for(int i = s; i <= e; i++) {
					//Swapping 
					str3 = swap(str3, s, i);
					PermuRecursive(str3, s+1, e);
					str3 = swap(str3, s, i);
				}
					
			}
		}
		public static String swap(String a, int i,int j) {
			char temp;
			char [] array = a.toCharArray();
			//reverse the values within an array
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			return String.valueOf(array);
		
		
	}
	//*********************************************************************
		
//*************************************************************************************************
		
	 public static void calender(int month, int year, String[] months, int[] days) {
		 
		 // check for leap year
	        if (month == 2 && isLeapYear(year)) 
	        	days[month] = 29;


	        // print calendar header
	        System.out.println("   " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");

	        // starting day
	        int d = day(month, 1, year);

	        // print the calendar
	        for (int i = 0; i < d; i++)
	            System.out.print("   ");
	        for (int i = 1; i <= days[month]; i++) {
	            System.out.printf("%2d ", i);
	            if (((i + d) % 7 == 0) || (i == days[month])) 
	            	System.out.println();
	        }
			
					

		}
		 public static int day(int month, int day, int year) {
		        int y = year - (14 - month) / 12;
		        int x = y + y/4 - y/100 + y/400;
		        int m = month + 12 * ((14 - month) / 12) - 2;
		        int d = (day + x + (31*m)/12) % 7;
		        return d;
		    }

		    // return true if the given year is a leap year
		    public static boolean isLeapYear(int year) {
		        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		        if  (year % 400 == 0) return true;
		        return false;
		    }

//*********************************************************************************************
		    
		

}

