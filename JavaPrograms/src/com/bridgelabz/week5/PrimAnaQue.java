package com.bridgelabz.week5;

import java.util.Arrays;

public class PrimAnaQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		QNode<Integer> que = new QNode<Integer>(); 
		  boolean flag = false;
	        int  k=0;
	        int intArray[] = new int[n];
	        for(int i=0;i<n;i++)   
	        {
	        	
	            
	        	for(int j=2; j<i; j++)    
	            {
	        	 que.enqueue(intArray[j]);
		        	
		        	//que.display();
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
	    	QNode<String> que = new QNode<String>(); 
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
	        	que.enqueue(br[m]);
	        	que.display();
	        	
	            for(int p=1; p<k; p++)
	            {   
	            	
	            	
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
