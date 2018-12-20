package com.bridgelabz.week5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import utility.Utility;

public class OrderedList {

	private static Scanner scan;

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Order.txt");	// to open the file	
		OrderedLinkedList<Integer> listInt = new OrderedLinkedList<Integer>();		//Linked list created manually
		
		    scan = new Scanner(file);
	        int counter =0; 	//keep track of how many integers in the file
	        while(scan.hasNextInt()) 
	        {
	            counter++;
	            scan.nextInt();
	        }
	        scan = new Scanner(file); 
	        int a[] = new int[counter];
	        System.out.println("File elements are:");
	        for(int i=0;i<counter;i++)
	        {
	            a[i]=scan.nextInt(); 	//fill the array with the integers
	            System.out.print(a[i]+" ");
	        }
		System.out.println("\n \nSorted file elements into array:");
		Utility.bubbleSort(a, counter);
	        for(int i=0;i<counter;i++)
	        {
	            System.out.print(a[i]+" ");
	            listInt.addInt(a[i]);	//fill the array with the integers
	        }
	
	        boolean isEmpty = listInt.isEmpty();
	        System.out.println("\nIs Linked list Empty?? :"+isEmpty);
	        
	        listInt.display();		//To display elements of linked list
		
	    int size = listInt.getSize();
	    System.out.println("Size of Linked List is :"+size);
	    
		System.out.println("\nEnter an element to search :");
		int search = Utility.inputInt();
		if(listInt.search(listInt.head,search))
	    {
	    	int index = listInt.indexOf(search);
	    	listInt.Delete(listInt.head,index);
	    	listInt.display();
	    	//System.out.println("Element found..");
	    }
		else
		{	
			//System.out.println("Element not found..");
			listInt.addInt(search);
			listInt.display();
		}	
		
		

		String temporary="";
		
			for(int j=0;j<listInt.size();j++)
			{
				temporary+=listInt.get(j)+" ";
				//System.out.print(list.get(j)+" ");
			}
			
			//System.out.println("\nString is :\t"+temporary);
			
			
			
		//write a file to specfied path and store the number in the list
		Utility.writeAllToFile("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Order.txt", temporary);
		String readedFile2=Utility.readAllFromFile("/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Order.txt");
		System.out.println("ReadFile :"+readedFile2);

	}

}
