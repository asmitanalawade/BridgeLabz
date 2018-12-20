package com.bridgelabz.week5;

import java.io.*;
import java.util.Scanner;

import utility.Utility;

public class UnorderedList {
	
	private static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Samp.txt");	
		
		br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));		
		String line = " ";
		Scanner sc = new Scanner(System.in);
		    
		UnorderedLinkedList<String> list = new UnorderedLinkedList<String>();		
		String read = " ";
		while((line = br.readLine())!= null)	
		{
			read += line;						
		}
		
		//System.out.println(read);
		//Copy the elements from string to String array by splitting each element
		String array[] = read.split(" ");		
		for(int i=0;i<array.length;i++)
		{
			list.add(array[i]);					
		}
		
		//Check if the list is empty
		System.out.println("List empty? " + list.isEmpty());
		  
		list.display();						
		
		System.out.println("Enter a word to search from input file :");
		    String search = Utility.inputString();
		    System.out.println("Input string to be search :"+search);
		    if(list.search(search))
		    {
		    	int index = list.indexOf(search);
		    	list.Delete(index);
		    	list.display();
		    	System.out.println("Element found..");
		    }
		    else
		    {	
				System.out.println("Element not found..");
				list.add(search);
				list.display();
				
				
				String temporary="";
				
					for(int j=0;j<list.size();j++)
					{
						temporary+=list.get(j)+" ";
						//System.out.print(list.get(j)+" ");
					}
					
					//System.out.println("\nString is :\t"+temporary);
					
					
					
				//write a file to specfied path and store the number in the list
				Utility.writeAllToFile("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Samp.txt", temporary);
				String readedFile2=Utility.readAllFromFile("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Samp.txt");
				System.out.println("ReadFile :"+readedFile2);		
				
		    }	
	}

}
