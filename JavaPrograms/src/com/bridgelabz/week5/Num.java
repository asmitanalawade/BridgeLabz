package com.bridgelabz.week5;
import java.util.*;
public class Num {
	public int data;
	public int count=0;
	
	public void add(int data) {
		this.data = data;
		count++;
	}
	 
//	public void add(int data)
//	{
//		for(int i=0; i<count; i++)
//		{
//			continue;
//		}
//		
//	}
	
	public void addAtPosition(int data, int index) {
		for(int i = 0; i < index; i++) {
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt())
			{
				continue;
			}
			add(i);
			count++;
		}
	}
	
	public void show()
	{
		for(int i=0; i<count; i++)
		{
			System.out.println(data);
		}
	}
	
}


	
	




	

