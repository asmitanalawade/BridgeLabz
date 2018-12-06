package com.bridgelabz.functional;
import utility.Utility;


public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of temperature: ");
		int t = Utility.inputInt();
		System.out.println("Enter the value of wind speed: ");
		int v = Utility.inputInt();
		Utility.WindChill(t, v);
		

	}

}
