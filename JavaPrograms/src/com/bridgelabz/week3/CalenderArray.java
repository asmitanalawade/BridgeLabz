package com.bridgelabz.week3;

import utility.Utility;

public class CalenderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month");
		int month = Utility.inputInt();
		System.out.println("Enter the year");
		int year  = Utility.inputInt();
		  // months[i] = name of month i
		// leave empty so that months[1] = "January"
        String[] months = {"", "January", "February", "March",  "April", "May", "June",          
        		 "July", "August", "September", "October", "November", "December"};      
           
           
           

        // days[i] = number of days in month i
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        Utility.calenderArray(month, year,months,days);

	}

}
