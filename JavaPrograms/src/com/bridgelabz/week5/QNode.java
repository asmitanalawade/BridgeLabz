package com.bridgelabz.week5;

import java.util.NoSuchElementException;

public class QNode<T> {

	T key;
	QNode<T> next;
	public String data;
	

	
	public QNode(T key) {
		this.key = key;
		this.next = null;
	}



	public QNode() {
		this.key = key;
		this.next = null;
	}


}
	
	
	
//***************************************************************************************************************
	
    class Queue<T>{
		 QNode<T> front, rear; 
		 int size = 0;
		 int data;
	       
//**********************************************************   
	
	public Queue() { 
	   front = rear = null; 
    } 
	
//************************************************************	
	
	  public void enqueue(int data) {
		
		  QNode temp = new QNode(data);
		
		  if(isEmpty()) {
			front = temp;
			rear = front;
		}
		  else {
		
			  rear.next = temp;
		  }
			  rear = temp;
			  size++;
		
	}
	
//*************************************************************
	public String dequeue() {
		
		String result = null;
		if(isEmpty()) {
			 throw new NoSuchElementException("Queue is already empty");
		}
		else {
			QNode<T> temp = front;
			
		 result = front.data;
			
			front = front.next;
			
//			if(front == null)
//				rear = null;
//			   return null;
		}
		
		return result;
			
		
	}
//************************************************************
	
	 public boolean isEmpty() {
	    	return front == null;
	 }
	 
//*************************************************************
	 public int size() {
		 
		return size;
	 }
//**************************************************************
	 
	 public void show() {
			
			if(isEmpty()) {
				
			return;
			
			}
			else {
				
				QNode<T> current = front;
				
				while(current != null) {
				
					System.out.print(current.data + "-->");
					current = current.next;
				}
				
        	}
	 }		
  
}    
