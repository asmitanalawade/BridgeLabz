
/**
 * Purpose : This program take the input from the user and write a program to 
 *           register of the user.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   4/12/2018          
 */

package com.bridgelabz.week3;

import utility.Utility;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your first name");
		String fname = Utility.inputString();
		boolean status = Utility.registerName(fname);
		
		
		System.out.println("Enter your last name");
		String lname = Utility.inputString();
		boolean status1 = Utility.registerName(fname);
		if(status1)
		
		System.out.println("Enter your Email Address");
		String mail = Utility.inputString();
		boolean status2 = Utility.registerMail(mail);
		
		System.out.println("Enter your contact number");
		String contact = Utility.inputString();
		boolean status3 = Utility.registerContact(contact);
		
		System.out.println("Enter your company name");
		String company = Utility.inputString();
		boolean status4 = Utility.registerCompany(company);
		
		System.out.println("Enter your user name");
		String username = Utility.inputString();
		boolean status5 = Utility.registerUsername(username);
		
		System.out.println("Enter your password");
		String password = Utility.inputString();
		boolean status6 = Utility.registerPassword(password); 
		
		
    
  }

}
