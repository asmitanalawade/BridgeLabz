package com.bridgelabz.week5;

//public class Node<T> {
//
//	T data;
//	Node<T> next;
//	public void Node(T data, Node<T> next) 
//	{
//		super();
//		this.data = data;
//		this.next = next;
//	}
	
	
	
//}


public class UnorderedLinkedList<T> {
	
	Node<T> head;
	Node<T> ptr;
	
	void add(T names)
	{
		String data = null;
		Node<T> next = null;
		Node<T> newNode = new Node(data,next);
		T string = (T) names.toString();
		newNode.data =  string;
		newNode.next = null;
		if(head ==null)
		{
			head = newNode;
			ptr = newNode;
		}
		else
		{
			ptr.next = newNode;
			ptr = newNode;
		}
	}

	//************************************************************************************
	void display()
	{
		Node<T> node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	//************************************************************************************
	public boolean search(T str) {
		
		if(head == null) {
			
			return false;
		}
		else {
    
        Node<T> current = head;    //Initialize current 
        
        while (current != null) 
        { 
            if ((current.data).equals(str))  //data found               
                return true; 
        
        else 
                current = current.next;                  
        
       
           //data not found 
        	}
		}
		 return false;
	}

	//************************************************************************************
	public Object Delete( int position) 
	{
		
	    if (head == null)
	    {
	        return null;
	    } 
	    else if (position == 0) 
	    {
	        return head.next;
	    } 
	    else 
	    {
	        Node<T> n = head;
	        for (int i = 0; i < position - 1; i++)
	        {
	            n = n.next;
	        }
	        n.next = n.next.next;
	        return head;
	    }
	}

	//************************************************************************************
	public int size() 
	{
		Node<T> n = head;
		int count=0;
		while(n!=null)
		{
			count++;
			n = n.next;
		}
		return count;
	}
	
	//************************************************************************************
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
	
	//************************************************************************************
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

	//************************************************************************************
	public void insert(String data, int index) 
	{
		
        if(checkIndex(index)) 
        { // Otherwise insert at correct index
            Node<T> newNode = new Node<T>((T) data,null);
         
            // Insert at front
            if (index == 0)
            {         
                newNode.next = head;
                head = newNode;
   
            }
            else 
            { // Traverse the list to find insertion point
                int count = 1;
                
                // Create a reference to the node just before the insertion point
                Node<T> tmp = head;
                while(tmp.next != null && count < index) 
                {
                    tmp = tmp.next;
                    count++;
                }
                
                // Insert the node
                newNode.next = tmp.next;
                tmp.next = newNode;
            }
        }
    }

	private boolean checkIndex(int index) {
		// TODO Auto-generated method stub
		return true;
	}

	//************************************************************************************
	public void deleteLast()
	{
		Node<T> start = head;
	        Node<T> prev = null;

	        if(start == null || start.next == null)
	        {
	            head = null;
	            return;
	        }
	        while (start.next != null)
	        {
	            prev = start;
	            start = start.next;
	        }
	        prev.next = null;
	}

	//************************************************************************************
	public T get(int index)
	{
		if(index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node<T> temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}
}
