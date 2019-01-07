package com.bridgelabz.week4;

import org.json.simple.JSONObject;

import utility.Utility;

public class Inventory {

	public static void main(String[] args) 
	{

		JSONObject json = new JSONObject();
		
		System.out.println("Enter the number  entry:");
		int number = Utility.inputInt();
		
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter the product name");
			String name = Utility.inputString();
			
			System.out.println("Enter the price name");
			double price = Utility.inputDouble();

			System.out.println("Enter the weight name");
			 double weight = Utility.inputDouble();
			 
			 json.put("Name", name);
			 json.put("Price", price);
			 json.put("Weight", weight);
			 
		}
		
		for(int i=0;i<number;i++)
		{
			System.out.println(json);
		}
	}

}
