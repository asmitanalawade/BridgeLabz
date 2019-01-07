package com.bridgelabz.week5;

import java.util.Scanner;

public class PalidromeDNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String string = scanner.nextLine();
		
		boolean flag = false;
		
		DNode <Character> deque = new DNode <Character>();
		
		for(int i =0; i < string.length(); i++) {
			
			char str = string.charAt(i);
			
			deque.addTORear(str);
			deque.display();
			
			 flag = true;
		}
		while(deque.size() > 1) {
			
			if(deque.removeFront() != deque.removeRear()) {
				
				flag = false;
				break;
			}
		}
			if(flag == true) {
				
				System.out.println("palindrome");
			}
			else {
				
				System.out.println("Not a palindrome");
}
	}

}
