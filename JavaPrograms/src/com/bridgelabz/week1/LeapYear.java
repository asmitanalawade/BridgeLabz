
/**
 * Purpose : This program take year input from user and print the year is leap year or not
 *           a leap year.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   28/11/2018          
 */


package com.bridgelabz.week1;
import utility.Util1;


public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		int year = Util1.inputInt();
		
		if(year >= 1582) {
			//System.out.println("Year is greater than equal to 1582");
			 boolean status = Util1.Leap(year);
			if(status) {
				System.out.println(year + " is a leap year");
			}else {
				System.out.println(year + " is not a leap year");
			}
			
			
		}else {
			System.out.println("Year is not greater than equal to 1582");
		}
		
	}

}
