
/**
 * Purpose : This program take a month, year input from user and print the calender.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   30/11/2018          
 */

package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.StringFunctions;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		int year  = Integer.parseInt(args[1]);
		  // months[i] = name of month i
        String[] months = {"", "January", "February", "March",  "April", "May", "June",          
        		 "July", "August", "September", "October", "November", "December"};      // leave empty so that months[1] = "January"
           
           
           

        // days[i] = number of days in month i
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        StringFunctions.calender(month, year, months, days);
	}  
}
