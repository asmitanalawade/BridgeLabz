
/**
 * Purpose : This program take the input from the user and print message using regular expressions.
 *           ­> Use Regex to do the following
            i. Replace <<name>> by first name of the user ( assume you are the user)
            ii. replace <<full name>> by user full name.
            iii. replace any occurance of mobile number that should be in format 
               91­xxxxxxxxxx by your contact number.
            iv. replace any date in the format XX/XX/XXXX by current date.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   6/12/2018          
 */

package com.bridgelabz.week3;

import java.util.Date;
import java.text.SimpleDateFormat;

import utility.Utility;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take the input from user
		System.out.println("Enter your name");
		String name = Utility.inputString();
		String x[] = name.split(" ");
		String fname = x[0];
		System.out.println(fname);
		System.out.println("Enter your contact number");
		String contact = Utility.inputString();
		//System.out.println(contact);
		
		Date date = new Date();
		SimpleDateFormat Formatter = new SimpleDateFormat("dd/MM/yyyy");
		String today = Formatter.format(date);
		System.out.println(today);
		
		String template = "Hello <<name>>, We have your full name\n" + 
				"as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		
		
		String regexName = "<<name>>";
		String regexFullName = "<<full name>>";
		String regexPhoneNumber = "xxxxxxxxxx";
		String regexDate = "01/01/2016";
		
	    template = Utility.regexpression(template, regexName, fname);
	    template = Utility.regexpression(template,regexFullName,name);
	    template = Utility.regexpression(template,regexPhoneNumber,contact);
	    template = Utility.regexpression(template,regexDate,today);
		System.out.println(template);



	}

}
