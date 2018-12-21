package com.bridgelabz.week5;

public class DNode<T> {
	
	String data;
	DNode<T> prev;
	DNode<T> next;
}

 class Deque<T>{
	 
	
	DNode<T> front;
	DNode<T> rear;
	int size;
	
	
//	public void deque() {
//		front = rear = null;
//		size = 0;
//	}
	
	
	public int size(){
		return size;
	}
	
	public void isEmpty() {
		 front = null;
	}
	
	//*********************************
	
	public void addFront(int data) {
		DNode<T> newNode = new DNode<T>();
		
		if(newNode == null) {
			System.out.println("Overflow");
		}else if(front == null){
			front = rear = newNode;
		}else {
			newNode.next = front;
			front.prev = newNode;
			front = newNode;
		}
		size++;
	}
//*********************************************
	
	public void addRear(int data) {
		DNode<T> newNode = new DNode<T>();
		
		if(newNode == null) {
			System.out.println("Overflow");
		}else if(rear == null) {
			front = rear = newNode;
		}else {
			newNode.next = rear;
			rear.prev = newNode;
			rear = newNode;
		}
		size++;
	}
	
//****************************************************
	public void deleteFront() {
		
		if(front == null) {
			System.out.println("Underflow");
		}else {
			DNode<T> temp = front;
			front = front.next;
			
			if(front == null)
				rear = null;
			else
				front.next = null;
			size--;
		}
	}
//*********************************************************
	
	public void deleteRear() {
		
		if(rear == null) {
			System.out.println("Underflow");
		}else {
			DNode<T> temp = rear;
			rear = rear.next;
			
			if(rear == null)
				front = null;
			else
				rear.next = null;
			   size--;
		}
	}
	
//**********************************************************
	
	 
	 public void show() {
			
			if(front == null) {
				
			return;
			
			}
			else {
				
				DNode<T> current = front;
				
				while(current != null) {
				
					System.out.print(current.data + "-->");
					current = current.next;
				}
				
       	}
	 }		
}
