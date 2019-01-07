package com.bridgelabz.week5;

import java.util.Arrays;
import java.util.LinkedList;

public class PrimeStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		Stack<Integer> stack = new Stack<Integer>(); 
		  boolean flag = false;
	        int  k=0;
	        int intArray[] = new int[n];
	        for(int i=0;i<n;i++)   
	        {
	        	
	            
	        	for(int j=2;j<i;j++)    
	            {
	        		stack.push(intArray[j]);
		        	
		        	//stack.display();
	                if(i%j==0)        
	                {
	                    flag = false;
	                    
	                }
	                else
	                    flag = true;
	                break;
	            }
	       
	            if(flag)
	            {
	            	 //Number should not be 0 or 1
	                if(i!=1 || i!=0)               
	                {
	                                     
	                    intArray[k] = i;          
	                    k++;                        
	                }
	            }
	        }
	        System.out.println("Anagrams are :");
	        checkAnagram(intArray, k);               

	    }

	      
	    
	    public static void checkAnagram(int intArray[], int k)
	    {
	    	Stack<String> stack = new Stack<String>(); 
	        String strArray,str1;
	        String br[] = new String[k];
	        boolean flag = false;
	        for (int i = 0; i < k; i++)
	        {
	       
	        	// Convert integer to string
	            strArray = Integer.toString(intArray[i]);
	            //Convert String array to character array
	            char z[] = strArray.toCharArray();
	            Arrays.sort(z);
	            //Convert string into integer
	            str1 = String.valueOf(z);
	            br[i] = str1;
	        }
	     //   System.out.println();
	        for(int m=0; m<k; m++)
	        {
	        	stack.push(br[m]);
	        	stack.display();
	        	
	            for(int p=m+1; p<k; p++)
	            {      
	            	stack.peek();
	                    if(br[m].equals(br[p]))
	                    {
	                    	//Print anagram numbers
	                        System.out.println(intArray[m]+ " -- " +intArray[p]);
	                        
	                        flag=true;
	                    }
	            }
	        }
	        if(flag == false)
	        {
	            System.out.println("Exit");
	        }
	        

	    }

	

}
