
/**
 * Purpose : This program take two input from user and find the day is between 20 march and 
 *           20 june.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */



package com.bridgelabz.week1;
import utility.Util1;


public class DayMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take a input from user in day and month.
		System.out.println("Enter the value of day");
		int d = Util1.inputInt();
		System.out.println("Enter the value of month");
		int m = Util1.inputInt();
		boolean result = Util1.day(d, m);
		
		// print the day of month between 20 march and 20 June
		System.out.println(result);
		
			
				

        
	}

}
