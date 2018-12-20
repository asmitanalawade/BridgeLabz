package com.bridgelabz.week5;

public class QNode {

	int key;
	QNode next;
	

	
	public QNode(int key) {
		this.key = key;
		this.next = null;
	}
}	
	
//***************************************************************************************************************
	
    class Queue{
		 QNode front, rear; 
		 int size = 0;
	       
//**********************************************************   
	
	public Queue() { 
	   this.front = this.rear = null; 
    } 
	
//************************************************************	
	
	public void enqueue(int key) {
		QNode temp = new QNode(key);
		if(this.rear == null) {
			this.front=this.rear=temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
		
	}
	
//*************************************************************
	public QNode dequeue() {
		if(this.front == null)
			return null;
		QNode temp = this.front;
		this.front = this.front.next;
		if(this.front == null)
			this.rear = null;
		   return null;
	}
//************************************************************
	
	 public boolean isEmpty() {
	    	return front == null;
	 }
	 
//*************************************************************
	 public int size() {
		 
		return size;
	 }
	 
}
