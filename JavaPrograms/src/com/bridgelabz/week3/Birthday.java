package com.bridgelabz.week3;

import java.util.HashSet;

import utility.Utility;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println("Enter the year");
//		int year = Utility.inputInt();
//		System.out.println("Enter the month");
//		int month = Utility.inputInt();
//		System.out.println("Enter the date");
//		int date  = Utility.inputInt();
//		  // months[i] = name of month i
//		// leave empty so that months[1] = "January"
//        String[] months = {"", "January", "February", "March",  "April", "May", "June",          
//        		 "July", "August", "September", "October", "November", "December"};      
//           
//        // days[i] = number of days in month i
//        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        
//     // check for leap year
//        if (month == 2 && isLeapYear(year)) 
//        	days[month] = 29;
//
//
//	}
//	 public static boolean isLeapYear(int year) {
//	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
//	        if  (year % 400 == 0) return true;
//	        return false;
		
		
		 int counter = 1;
	        HashSet<Integer> birthdayset = new HashSet<Integer>();
	 
	                // don't need these two lines, taken care of in loop
	        int number = (int)(Math.random()*(12) + 1);
	        birthdayset.add(number);
	                 
	            // use more informative variable name, eg: numberOfPeople
	            // for( int i = 1 ; i <= 50 ; i++ )
	            for (int i = 1; i < 50; i++)
	            {
	                        // reset counter
	 
	                       
	 
	                        // reset birthdayset
	 
	                                // nextInt(364) will return numbers in the range of: 0 - 363
	                number = (int)(Math.random()*(12) + 1);
	                if (birthdayset.contains(number)) {
	                  // once you find a match and bump counter increases
	                                       
	                    counter++;
	                } else {
	                    birthdayset.add(number);
	                     
	                }
	                 
	                // output statistics for this numberOfPeople
	            }
	             
	         
	        
	        System.out.println(counter + " people have the birthdates in same month");
    }

}
