package com.bridgelabz.functional;
import utility.Utility;
public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		int max = 1000;
		int random = (int)(Math.random()*max);
		Utility.Coupon(chars, max, random);

	}

}
