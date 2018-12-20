package com.bridgelabz.week5;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

import utility.Utility;

public class Unordered {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter string to search");

		String word1 = Utility.inputString();

		unorderedList(word1);
		}

		public static void unorderedList(String word1) throws IOException {

		String str=" ";

		String file = "/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week5/Samp.txt";

		File fileName = new File(file);

		Scanner reader = new Scanner(new FileReader(fileName));

		while (reader.hasNext()){

		str = reader.nextLine();

		}
		String s = str;

		String[] arr = s.split(" ", str.length());

		MyLinkedList<String> list = new MyLinkedList<String>();

		for(int i = 0 ; i < arr.length ; i++) {

		     list.insertAtLast(arr[i]);
		

		}
		   list.display();
		

		if(list.find(word1))
		{
		 

		    System.out.println(" word is already in list so remove it");

		    int remove = list.indexOf(word1);

		    list.deleteAtPosition(remove);

		    list.display();

		}
		else
		{
		   System.out.println("word is not in the list so add it");

		   list.insertAtLast(word1);

		   list.display();

		}
	}

}
