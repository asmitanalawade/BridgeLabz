package com.bridgelabz.week3;

import java.io.*;
import java.util.Arrays;

import utility.Utility;

public class BinarySearchWord {
private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/searchFunction/File.txt";
		File fileName = new File(file);
		br = new BufferedReader(new FileReader(fileName));
		String line;
		String arr[] = {};
		
		//System.out.println( n);
		
		while((line = br.readLine()) != null){
		     //process the line
//			for(int i = 0; i <= n; i++)
//			{
//				arr = line.split("\\s+");
//				
//			}
			
			//System.out.println(line);
			arr = line.split("\\s+");
        	   
		}
		System.out.println("Array elements: ");
		for(int i = 0; i < arr.length; i++)
		{
			
			System.out.println(arr[i]);
		}
	      Arrays.sort(arr, 0 , arr.length);
	
	      System.out.println("Sorting array: ");
	      for(int i = 0; i < arr.length; i++)
	     {
		
		     System.out.println(arr[i]);
	     }		
		     
		 System.out.println("Enter the word you want to search from word list");
		 String x = Utility.inputString();
		 //System.out.println("Intput searched string: ");
		 Utility.binaryWord(arr, x);
		
		
	}
	
	

}