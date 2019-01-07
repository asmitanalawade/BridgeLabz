package com.bridgelabz.week5;

import java.util.EmptyStackException;

public class Stack<T> {
	
	 
	Node<T> top;
	int size = 0;
	T data;
	
	
	
     
     
//*******************************************************************************
     
//     public int stack() {
//    	 top = null;
//    	 return size;
//    	 
//     }
	
//*************************************************************************
     
     public int getSize() {
    	 return size;
     }
     
//*************************************************************************
     
     public boolean isEmpty() {
    	return top == null;
     }
//*************************************************************************
     
     public void push(T data) {
    	 Node<T> newNode = new Node<T>(data);
    	 if(top == null) {
    		 top = newNode;
    	 }else {
    		 newNode.next = top;
    		 top = newNode;
    		 size++;
    		 
    	 }
     }
     
//     public void push(String data) {
//    	 Node<String> newNode = new Node<T>(data);
//    	 if(top == null) {
//    		 top = newNode;
//    	 }else {
//    		 newNode.next = top;
//    		 top = newNode;
//    		 size++;
//    		 
//    	 }
//     }
//********************************************************************************
     
     public T pop() {
    	 if(isEmpty()) {
    		 throw new EmptyStackException();
    	 }else {
    		 T result = top.data;
    		 top = top.next;
    		 size--;
    		 return result;
    	 }
     }
//**********************************************************************************
     
     public T peek() {
    	 if(isEmpty()) {
    		 throw new EmptyStackException();
    	
         }
    	 return top.data;
    	 
     }	
     
     //****************************************************************************
     
     public void display() {
			
			if(isEmpty()) {
				
				return;
			}
			else {
			
			for(Node<T> current = top; current != null; current = current.next) {
				
				System.out.print(current.data + "  ");
				
				
				}
			//System.out.print(current.data);
			System.out.println();
		
			
			}
			
		}
		
}