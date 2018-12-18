package com.bridgelabz.week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class MaxMin {

	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week4/maxmin.txt";
		File fileName = new File(file);
		br = new BufferedReader(new FileReader(fileName));
		String line ;
		//while(line= br.readLine() != null){
			
		//System.out.println(line);
		//break;
         String arr[] = {};
         
		
		//System.out.println( n);
		
		while((line = br.readLine()) != null){
			
		     //process the line
			arr = line.split("\\s+");
			System.out.println(line);
			
		}	
			
			int[] array = new int[arr.length];
			System.out.println("Array elements: ");
			for(int i = 0; i < arr.length; i++)
			{
				array[i] = Integer.parseInt(arr[i]);
				System.out.println(array[i]);
			}
			Utility.maxMin(array);
			
        	   
		}

	}


