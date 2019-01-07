package com.bridgelabz.week5;

public class Node <T>{
	
	Node <T> next;
	
//	int data;
//
//	Node(int data){
//		this.data = data;
//		
//	}
//	Node (int data, Node next){
//		
//		this.data = data;
//		this.next = next;
//		
//	}

	T data;

	public Node<T> prev;

	Node(T data){
		this.data = data;
		
	}
	Node (T data, Node <T>next){
		
		this.data = data;
		this.next = next;
		
	}
	
	

}
