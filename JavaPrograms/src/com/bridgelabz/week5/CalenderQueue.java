package com.bridgelabz.week5;

import utility.Util1;
import utility.Utility;
import java.util.*;

public class CalenderQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the month");
		int month = Utility.inputInt();
		System.out.println("Enter the year");
		int year = Utility.inputInt();
		
		
		String[]months = {" ", "Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug", "Sept","Oct", "Nov","Dec"};
		
		int[]days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		calQue(month,year,months,days);

	}
	public static void calQue(int month, int year, String[] months, int[] days) {
		
		QNode<String> queue = new QNode<String>();
		
		 if (month == 2 && Utility.isLeapYear(year))
             
      	   days[2] = 29;
											
		System.out.println("  " + months[month] + " " + year);
    
		System.out.println(" S  M Tu  W Th  F  S");

    	int d = Utility.day(1, month, year);

		for (int i = 1; i < d; i++) {
 	   
			queue.enqueue("" + i);
			System.out.print("  " + i);
		}
	     queue.display();
		for (int i = 1; i <= days[month]; i++) {
        
			if(i<=7)
			{
				queue.enqueue("\t"+i);
				
			}
			else if(i>7)
			{
				queue.enqueue("\t"+i);
			}
			
			if(( i + d )%9==7)
				queue.enqueue("\n");
				//System.out.println();
	 		}
				//queue.show();

	}
}
