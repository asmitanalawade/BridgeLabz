package com.bridgelabz.week5;

public class MyLinkedList <T> {
	
	Node<T> head;
	private Node<T> next;
	private int count;
	private T count1;
	
	
	public void add(T data) {
		
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			head = newNode;
		}else {
			
			Node<T> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
				
		
		
		
	}
	
//*****************************************************************************************	
	
	public void display()
	{
		Node<T> current = head;
		
		while(current != null) {
			System.out.println(current.data );
			current = current.next;
		}

	}
	
//******************************************************************************************	
	
	public void insertAtFirst(T data) {
		Node <T> new_node = new Node<T>(data);
		new_node.next = head;
		head = new_node;
	}
	
//******************************************************************************************	
	
	public void insertAtPosition(T data,T index) {
		
		
//		Node new_node = new Node(data , next);
//		new_node.data = data;
//		new_node.next = null;
//		Node temp = head;
//		
//		if(head == null) {
//			return;
//		}
//		else {
//			
//			for(int i=0; i<index-1; i++) {
//				
//				temp = temp.next;
//			}
//			
//			new_node.next = temp.next;
//			temp.next = new_node;
//		}
//		
		
		if(head == null) {
			return;
		}else {
			Node<T> newNode = new Node<T>(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
//*******************************************************************************************
	
	public void insertAtLast(T data) {
		Node<T> new_node = new Node<T>(data);
		new_node.data = data;
		new_node.next = null;
		if(head == null) {
			head = new_node;
		}else {
			Node<T> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
//		
//		if(head == null) {
//			head = new Node<T>(data);
//			return;
//		}
//		Node last = head;
//		while(last.next != null) {
//			last = last.next;
//			last.next = new_node;
//			return;
//		}
		
		
	}
//**********************************************************************************************
	
	

	
	public void deleteAtFirst() {
		
		Node temp = head;
		head = head.next;
		temp.next = null;
		
		
	}
	
//**************************************************************************************************
	
	public void deleteAtPosition(int index) {
		
		if(index == 0) {
			
			head = head.next;
			
		}
		Node<T>temp = head;
		int count = 0;
		while(count < (index-1)) {
			temp = temp.next;
			count++;
			
		}
		Node<T> current = temp.next;
		temp.next = current.next;
		current.next = null;
		count--;
		
	}
	
//***************************************************************************************************
	
	public Node<T> deleteAtLast() {
		
		Node<T> temp = head;
		Node<T> previousToTemp = null;
		while(temp.next != null) {
			previousToTemp = temp;
			temp = temp.next;
		}
		previousToTemp.next = null;
		return previousToTemp;
	}
//****************************************************************************************************
	
	public boolean search(T str) 
    { 
        Node<T> current = head;    //Initialize current 
        while (current != null) 
        { 
            if ((current.data).equals(str))                 
                return true;    //data found 
                current = current.next;                  
        } 
       
        return false;    //data not found 
    }
   
//****************************************************************************************************
   
//   public int index(T data) {
//		
//		Node<T> temp = head;
//		
//		int count = 0;
//		for(int i=0; i<count ; i++) {
//			
//			if(temp.data.equals(data)) {
//				
//				return i;
//			}
//			temp = temp.next;
//		}
//		return -1;
//}
   
	public int indexOf(T str)
	{
	     int size = 1;
	    Node<T> current = head.next;
	    while (current != null) {
	        if (current.data.equals(str)) {
	            return size;
	        }
	        size++;
	        current = current.next;
	    }
	        return size;
	    
	}
   
//**************************************************************************************************
   
	public boolean isEmpty()
	{
	    if (head == null) 
	    {
	    	System.out.println("List is Empty");
	    	return true;	     
	    }
	    else
	      return false;
	  }
	
//******************************************************************************************************
	
	public T pop(int index)
    {
        if(index==0)
        {
        	head = head.next;
           // T firstData=head.data;
            count--;
            //return firstData;
        }else {
        	Node<T> temp=head;
        for(int i=0; i<index-1; i++)
        {
            temp=temp.next;
        }
        T dataOfIndex=temp.next.data;
        temp.next=temp.next.next;
        count--;
        return dataOfIndex;

        }
		return count1;
		
}
//*************************************************************************************************************
	
     public boolean find (T searchkey) {
		
		if(head == null) {
			
			return false;
		}
		else {
			
			Node<T> temp = head;
			
			while(temp != null) {
				
				if((temp.data).equals(searchkey)) {
					return true;
				}
				else {
					
					temp = temp.next;

				}
				
			}
		}
		return false;
}
}
