package com.bridgelabz.week1;

import java.io.*;



import utility.Util1;

public class KDWPattern {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the names :");
		
		String names = Util1.inputString();
		
		String word[] = null;
		
		for(int i = 0;i < names.length();i++)
		{
			word = names.split("\\s+");	
		}
		for(int i = 0;i < word.length;i++)
		{
			if(word[i].charAt(0)=='k')
			{
				Util1.showLines("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week1/KDWPattern.txt", 1,9);
				System.out.println();
				
			}
			else if(word[i].charAt(0)=='d')
			{
				Util1.showLines("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week1/KDWPattern.txt", 11,19);	
				System.out.println();
			}
			else if(word[i].charAt(0)=='w')
			{
				Util1.showLines("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week1/KDWPattern.txt", 21,29);		
			    System.out.println();
			}
			//else
			//	System.out.println("Given string do not match with any pattern..");
		}


     }
	

}
