package com.bridgelabz.week5;

import java.util.Scanner;

public class PalidromeDNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Deque<Character> deque = new Deque<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			deque.addRear(c);
		}
		int flag=0;

		while(deque.size()>1)
		{
			if(deque.deleteFront()!=deque.deleteRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
}
		

	}

}
