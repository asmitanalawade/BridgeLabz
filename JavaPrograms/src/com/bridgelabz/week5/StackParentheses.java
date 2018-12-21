package com.bridgelabz.week5;

import java.util.Scanner;

public class StackParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the parentheses: ");
		Scanner sc = new Scanner(System.in);
		String exp = sc.next();
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < exp.length(); i++) {
			if((exp.charAt(i)=='(') ||( exp.charAt(i)=='{') || (exp.charAt(i)=='[')) {
				stack.push(exp.charAt(i));
			}else if((exp.charAt(i)==')') ||( exp.charAt(i)=='}') || (exp.charAt(i)==']')&&
				(!exp.isEmpty())) {
			
				if((exp.charAt(i) == ']' && stack.peek() == '[')||
					(exp.charAt(i)== '{' && stack.peek()== '{')||
					(exp.charAt(i) == ')' && stack.peek()== '(')) {
						  
				stack.pop();
			}else {
				
				System.out.println("Expression is balanced");
				
			}
		   
			}else {  
				if((exp.charAt(i)==')') ||( exp.charAt(i)=='}') || (exp.charAt(i)==']')) {
					System.out.println("Expression is not balanced");
				}
					
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Expression is balanced");
		
		}
		else  {
			
			System.out.println("Expression is not balanced");
		}
    }
		

}


