package com.bridgelabz.functional;
import utility.Utility;


public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
         System.out.println("Enter the positive integer");
         int n = Utility.inputInt();
         int heads = 0;
         int tail = 0;
         
         Utility.HeadsAndTail(heads, tail, n);
	}

}