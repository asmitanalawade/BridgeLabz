
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
		String fname,lname,mail,contact,company, username,password;
		boolean status,status1,status2,status3,status4,status5,status6;
		
	do {
		System.out.println("Enter your first name");
	    fname = Utility.inputString();
		status = Utility.registerName(fname);
		
		
		System.out.println("Enter your last name");
		lname = Utility.inputString();
		status1 = Utility.registerName(fname);
		if(status1)
		
		System.out.println("Enter your Email Address");
		mail = Utility.inputString();
		status2 = Utility.registerMail(mail);
		
		System.out.println("Enter your contact number");
		contact = Utility.inputString();
		status3 = Utility.registerContact(contact);
		
		System.out.println("Enter your company name");
	    company = Utility.inputString();
		status4 = Utility.registerCompany(company);
		
		System.out.println("Enter your user name");
		username = Utility.inputString();
		status5 = Utility.registerUsername(username);
		
		System.out.println("Enter your password");
		password = Utility.inputString();
		status6 = Utility.registerPassword(password); 
		
		if(status!=status1 || status1 != status2||status2!=status3||status4!=status5||status5!=status6) {
			System.out.println("Please enter valid information...");
		}
		
     }
	while(status!=status1 || status1 != status2||status2!=status3||status4!=status5||status5!=status6);
	
	 if(status) 
	 {
		System.out.println("Enter your first name"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 if(status1) 
	 {
		System.out.println("Enter your last name"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 if(status2) 
	 {
		System.out.println("Enter your Email"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 if(status3) 
	 {
		System.out.println("Enter your contact number"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 if(status4) 
	 {
		System.out.println("Enter your company name"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 if(status5) 
	 {
		System.out.println("Enter your username"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 if(status6) 
	 {
		System.out.println("Enter your password"); 
	 }else 
	 {
		System.out.println("Invalid information"); 
	 }
	 
	 
	
  }

}
