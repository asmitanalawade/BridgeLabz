package com.bridgelabz.functional;
import utility.Utility;


public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of stake");
		int stake = Utility.inputInt();
		System.out.println("Enter the number of goals");
		int goal = Utility.inputInt();
		System.out.println("Enter the number of time");
		int num = Utility.inputInt();
		Utility.Gambler(stake, goal, num);
		
		

	}

}
