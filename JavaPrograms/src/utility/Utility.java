package utility;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.functional.Permutation;
import com.bridgelabz.functionsandlibraries.MathFunctions;

public class Utility {
static Scanner sc = new Scanner(System.in);
	public static int inputInt() {
		return sc.nextInt();
	}
	public static double inputDouble() {
		return sc.nextDouble();
	}
	public static String inputString() {
		return sc.next();
	}

	
	
	
	
	public static void UserName(String Name){
		if(Name.length() > 3) {
			System.out.println(" Hello " + Name+ ",How are you?");
		}else {
		System.out.println("length of the name is not greater than three");
	}
	}
	
	//*********************************************************************************
	
	public static void HeadsAndTail(int heads,int tail, int n) {
		for(int i = 1; i <= n; i++) {
      	  double a = Math.random();
      	 System.out.println(" " + a);
      	 if(Math.random()<0.5) {
      		 heads = heads + 1;
      	 }else {
      		 tail = tail + 1;
      	 }
       }
       float PercentageOfHeads = (heads/n)*100;
       System.out.println("Number of heads in Percentage" + PercentageOfHeads);
	}
	//***********************************************************************************

	public static void leap(int year) {
		// Number should be four digit number
		if(year >= 1000) {
			System.out.println("It is a Four digit number");
			// Find the leap year
			if(year%4 == 0) {
				System.out.println("Leap year");
			}else {
				System.out.println("Not a leap year");
			}
		}else {
			System.out.println("It is not four digit number");
		}

	}
	//*************************************************************************************
	
	public static void Power(int num, int power, int i) {
		System.out.println("Power of 2 that are less than or equal to 2^");
		while(i <= 31) {
			System.out.println(" 2^ " + i + " = " + power);
			power = power * 2;
			i++;
		}
	}
	//*************************************************************************************
	
	public static void Harmonics(int n, double sum) {
		 System.out.println("Harmonic series is: ");
	        while(n > 0) {
	        	
	        	sum = sum + (double)1/n;
	        	n--;
	        	System.out.println(" " + sum);
	        }
	       System.out.println(" ");
	       System.out.println("Value of the harmonic series is : "+ sum);
			
	}
	//***********************************************************************************
	
	public static void prifactor(int n) {
		// condition for prime numbers
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
				System.out.println(i + " ");
				n= n/i;
			}
			
		}
		if(n > 1)
		
			System.out.println(n);
			
		}
	
	
	//**********************************************************************************
	
	public static void Gambler(int stake, int goal, int num) {
		//Initialize the bets and wins
		int bets = 0;
		int wins = 0;
		for(int i = 0; i <= num; i++) {
			int cash = stake;
			while(cash > 0 && cash < goal) {
				bets++;
				if(Math.random() < 0.5) {
					cash++;
				}else {
					cash--;
				}
				
			}
			if(cash == goal) 
				wins++;
			
		}
		System.out.println(wins + " wins of " + num);
		System.out.println("Percent of game won: "+ wins/num*100);
		System.out.println("Average = " + bets/num);
	}
	//*********************************************************************************
	
	public static void Coupon(char[] chars,int max,int random) {
		StringBuffer sb = new StringBuffer();
		while(random > 0) {
			sb.append(chars[random % chars.length]);
			random /= chars.length; 
		}
		String CouponNum = sb.toString();
		System.out.println("Coupon number is: " + CouponNum);
	}
	//******************************************************************************
	
//	public static void Array(int m, int n, int[][]matrix) {
//		
//		
//		System.out.println("Enter the 2D array");
//		for(int i = 0; i < m; i++)
//			for(int j = 0; j < n; j++)
//				matrix[i][j] = Utility.inputInt();
//				
//	}
	
	
	
	//*****************************************************************************
	
	public static void triplet(int n, int a[]) {
		int count = 0;
		for(int i=0;i<n-2;i++) {
		
		  for(int j=i+1;j<n-1;j++) {
		
		    for(int k=j+1;k<n;k++) {
		
		      if(a[i]+a[j]+a[k]==0) {
		
		        System.out.println(a[i]+" "+a[j]+" "+a[k]+" ");
		        count++;
		      }

		    }
		  }

		}
		if(count==0) {
		
		 System.out.println("Not Exist");
		}
		System.out.println("Number of triplets present " +count);
			
	}
	//******************************************************************************
	
	public static void Distance(int x, int y) {
		double distance; 
		distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance from"+"("+x+","+y+")"+"to"+"(0,0)"+ " = " + distance);
	}
	//*******************************************************************************
	
	public static void permute(String str, int s, int e) {
		if(s == e) {
			System.out.println(str);
		}else {
			for(int i = s; i <= e; i++) {
				
				str = swap(str, s, i);
				permute(str, s+1, e);
			//	str = swap(str, s, i);
			}
				
		}
	}
	public static String swap(String a, int i,int j) {
		char temp;
		char [] array = a.toCharArray();
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return String.valueOf(array);
		
	}
	//****************************************************************************
	
	public static void StopWatch(double startTime, double stopTime) {
		double elapsedTime ;
		System.out.println("Press 1 to start time ");
		double a = sc.nextInt();
		if(a == 1) {
			startTime = System.currentTimeMillis();
			System.out.println("Start time : " + startTime);
		}
		System.out.println("press 2 to stop time");
		double n = sc.nextInt();
		if(n == 2) {
			stopTime = System.currentTimeMillis();
			System.out.println("Stop time: " + stopTime);
		}
		System.out.println("Press 0 to find the elapsed time");
		double b = sc.nextInt();
		if(b == 0) {
			elapsedTime = stopTime - startTime;
			System.out.println("Elapsed time: " + elapsedTime);
			
		}
	}
	//*****************************************************************************
	
	public static void Quadratic(int a,int b, int c) {
		int d = (b*b)-(4*a*c);
		System.out.println("Answer is: "+ d);
		if(d > 0) {
		double root1 = (-b + (Math.sqrt(d))/(2.0 * a));
		double root2 = (-b - (Math.sqrt(d))/(2.0 * a));
		System.out.println("The roots values of" + root1 + "and" + root2);
		}else if(d == 0) {
			double root1 = (-b /(2.0 * a));
			System.out.println("The root is " + root1);
			
		}else {
			System.out.println("The equation has no real root");
		}

	}
	//*****************************************************************************
	
	public static void WindChill(int t, int v) {
		double w = 35.74 + 0.6215*t +(0.4275*t - 35.75)* Math.pow(v,0.16);
		System.out.println("Wind cill = " + w);
	}
	//*****************************************************************************
	
	// Algorithm Problems
	
	//*****************************************************************************
	
	public static void isAnagram(String str1,String str2) {
		String s1 = str1.replaceAll("\\n", " ");
		String s2 = str2.replaceAll("\\n", "");
		boolean status = true;
		if(s1.length() != s2.length()) {
		  status = false;
			
		}else {
	
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();                                                                                                                            
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array,s2Array);
			
		}
		if(status) {
			System.out.println(s1 + " and " + s2 + " is a Anagram");
		}else {
			System.out.println(s1 + " and " + s2 + " is not Anagram");
		}
	}
	//*******************************************************************************
	
	public static void prime(int count) {
		for(int i = 0; i < 1000; i++) {
			boolean isPrimeNumber = true;
			
			for(int j = 2; j < i; j++) {
				while(i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber) {
				count++;
				System.out.println(i + "  ");
			}
		}
		System.out.println("Count : " + count);

	}
	
	//*******************************************************************************
	
	public static void insertion(int n, String[] array) {
		String temp;
		System.out.println("Enter the letters of the string array ");
		for(int i = 0; i < n; i++) {
			array[i] = sc.next();
			
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				
				if(array[i].compareToIgnoreCase(array[j]) > 0) {
				
				 temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				}
			}
			
		}
		System.out.println("Insertion sorted array: ");
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
	
	//*******************************************************************************
	
	public static void bubble(int n, int[] array) {
		System.out.println("Enter the element of the array");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		} 
	    for(int i = 0; i < n; i++) {
	    	for(int j= 1; j < n; j++) {
	    		if(array[j-1] > array[j]) {
	    			int temp = array[j-1];
	    			array[j-1] = array[j];
	    			array[j] = temp;
	    		}
	    			
	    	}
	    }
		System.out.println("Bubble sorted array: ");
        for(int i = 0; i < n; i++) {
        	System.out.println(" " + array[i]);
        }
		System.out.println();

	}
	//*******************************************************************************
	
	static void merge(String arr[], int l, int m, int r) 
	{ 
	    
	    int n1 = m - l + 1; 
	    int n2 = r - m; 

	    String L[] = new String[n1]; 
	    String R[] = new String[n2]; 

	    for (int i=0; i<n1; ++i) 
	        L[i] = arr[l + i]; 
	    for (int j=0; j<n2; ++j) 
	        R[j] = arr[m + 1+ j]; 

	    int i = 0, j = 0; 
	    int k = l; 
	    while (i < n1 && j < n2) 
	    {  
	        int comp=L[i].compareTo(R[j]);
	        if (comp<0) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = R[j]; 
	            j++; 
	        } 
	        k++; 
	    } 

	    while (i < n1) 
	    { 
	        arr[k] = L[i]; 
	        i++; 
	        k++; 
	    } 

	    while (j < n2) 
	    { 
	        arr[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
	} 


	 public static void sort(String arr[], int l, int r) 
	 { 
	     if (l < r) 
	     { 
	         int m = (l+r)/2; 

	         sort(arr, l, m); 
	         sort(arr , m+1, r); 

	         merge(arr, l, m, r); 
	     } 
	 }
	 
//*********************************************************************************
      
	 public static void binaryWord(String[]arr,String x) {
		 //Initialize the first, last, and mid value
		 int first = 0;
		 int last = arr.length - 1;
		 int mid = (first + last)/2;
		 while(first <= last) {
			 //Compare the mid to string x is less than 0 then print first value
			 if(arr[mid].compareTo(x) < 0) {
				 first = mid + 1;
			 }else if(arr[mid].compareTo(x) == 0) {
				 System.out.println("Word found in the word list : " + mid);
				 break;
			 }else {
				 last = mid + 1;
			 }
			 mid = (first + last)/2;
		 }
		 
		 if(first > last) {
			 System.out.println("Word is not found");
		 }
	}
		 

	 

//***********************************************************************************
 
     public static String poem(String template,String regexName, String regexSound){ 
    	 Pattern pattern = Pattern.compile(regexName);
    	 Matcher match = pattern.matcher(template);
    	 return match.replaceAll(regexSound);
    	 
     }
//************************************************************************************
   
     public static String regexpression(String template,String regexName,String regexFullName){ 
    	 Pattern pattern = Pattern.compile(regexName);
    	 Matcher match = pattern.matcher(template);
    	 return match.replaceAll(regexFullName);
     }
	
//**********************************************************************************************
     
     public static boolean registerName(String name) {
    	 boolean status = false;
    	 Pattern pattern = Pattern.compile("[a-zA-Z]+");
    	 Matcher match = pattern.matcher(name);
    	 
    	 if(match.find() && match.group().equals(name)) {
    		 
    		status = true; 
    	 
         }else {
    	  
        	 System.out.println("Invalid information");
         }
      return status;
      
     }
     
     //*****************************************************
     
     public static boolean registerMail(String mail) {
    	 boolean status = false;
    	 Pattern pattern = Pattern.compile("[A-Z a-z _0-9]+@.*");
    	 Matcher match = pattern.matcher(mail);
    	 if(match.find() && match.group().equals(mail)) {
    		 
    		 status = true;
    	 }else {
    		 System.out.println("Invalid information");
    	 }
    	 
    	return status;
    	 
     }
    //*******************************************************
     
     public static boolean registerContact(String contact) {
    	 boolean status = false;
    	 Pattern pattern = Pattern.compile("[7-9][0-9]{9}");
    	 Matcher match = pattern.matcher(contact);
    	 if(match.find() && match.group().equals(contact)) {
    		 
    		 status = true;
    	 }else {
    		 System.out.println("Invalid information");
    	 }
    	 
    	return status;
    	 
     }
     //*****************************************************
     
     public static boolean registerCompany(String company) {
    	 boolean status = false;
    	 Pattern pattern = Pattern.compile("[A-Za-z]+");
    	 Matcher match = pattern.matcher(company);
    	 if(match.find() && match.group().equals(company)) {
    		 
    		 status = true;
    	 }else {
    		 System.out.println("Invalid information");
    	 }
    	 
    	return status;
    	 
     }
     //*****************************************************
     public static boolean registerUsername(String username) {
    	 boolean status = false;
    	 Pattern pattern = Pattern.compile("[a-z0-9]+");
    	 Matcher match = pattern.matcher(username);
    	 if(match.find() && match.group().equals(username)) {
    		 
    		 status = true;
    	 }else {
    		 System.out.println("Invalid information");
    	 }
    	 
    	return status;
    	 
     }
    //*********************************************************
     
     public static boolean registerPassword(String password) {
    	 boolean status = false;
    	 Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{8})");
    	 Matcher match = pattern.matcher(password);
    	 if(match.find() && match.group().equals(password)) {
    		 
    		 status = true;
    	 }else {
    		 System.out.println("Invalid information");
    		 status = false;
    	 }
    	 
    	return status;
    	 
     }
     
//************************************************************************************
     
     
     public static void find(int low,int high){
		 // int tries = 0;
		    //Displaying the value
		    if(low==high){
		      System.out.println("Your number is : "+low);
		      System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
		      return;
		    }
		    //Finding middle value between range low and high
		     int mid=(low+high)/2;
		    int ch;
		    int tries = 0;
		    System.out.println("Press 1 : "+low+" - "+mid);
		   
		    System.out.println("Press 2: "+(mid+1)+" - "+ high);
		   
		    
		    
		   
		    ch=Utility.inputInt();
		    //Number is in first half
		    if(ch==1){
		      find(low,mid);
		    }
		    //Number is in second half
		    else{
		      find(mid+1,high);
		    }
		}
//**************************************************************************************
    public static void arrayaIntDou(int m, int n, int array[][]) {
    	
    	//Enter the elements
   		System.out.println("Enter " + m*n + " element ");
   		for(int i = 0; i < m ;i++) {
   			for(int j = 0; j < n; j++) {
   				array[i][j] = Utility.inputInt();
   			}
   		}
   		
   		// print 2D array
   		System.out.println("Enter the 2D array");
   		for(int i = 0; i < m; i++) {
   			for(int j = 0; j < n; j++) {
   			System.out.print(array[i][j] + " ");	

   			}
   			System.out.println();
   		}	
     }
    
//**********************************************************************************************************
   
    public static void primeNumberAnagram(int n)
    {
        boolean flag = false;
        int  k=0,i;
        int intArray[] = new int[n];
        for(i=0;i<=n;i++)   
        {
            for(int j=2;j<i;j++)    
            {
                if(i%j==0)        
                {
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
       
            if(flag)
            {
            	 //Number should not be 0 or 1
                if(i!=1 || i!=0)               
                {
                    //System.out.print(i+" ");                         
                    intArray[k] = i;          
                    k++;                        
                }
            }
        }
        System.out.println("Anagrams are :");
        checkAnagram(intArray, k);               

    }

        //**************************************
    
    public static void checkAnagram(int intArray[], int k)
    {
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
        System.out.println();
        for(int m=0;m<=k;m++)
        {
            for(int p=m+1;p<k;p++)
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
//*****************************************************************************************************
    public static void calenderArray(int month, int year,String[] months, int[] days) {
    	 // check for leap year
        if (month == 2 && isLeapYear(year)) 
        	days[month] = 29;


        // print calendar header
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");

        // starting day
        int d = day(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) 
            	System.out.println();
            
        }
		
				

	}
	 public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }

	    // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
    }
   
//*******************************************************************************************************
	    
	    public static String[][] gamblArray(int stake, int goal, int num) {
			//Initialize the bets and wins
			int bets = 0;
			int wins = 0;
			String result[][] = new String[2][2];
			for(int i = 0; i <= num; i++) {
				int cash = stake;
				while(cash > 0 && cash < goal) {
					bets++;
					if(Math.random() < 0.5) {
						cash++;
					}else {
						cash--;
					}
					
				}
				if(cash == goal) 
					wins++;
				
			}
			
			System.out.println("Percent of game won: "+ wins/num*100);
			System.out.println("Average = " + bets/num);
			System.out.println(wins + " wins of " + num);
			int loss = num - wins;
			System.out.println(loss + " loss of " + num);
			
			result[0][0] = "wins";
			result[0][1] = "loss";
			result[1][0] = Integer.toString(wins);
			result[1][1] = Integer.toString(loss);
			
			
			 return result;
		}
//*************************************************************************************************************
	    public static String oldMac(String template,String regexName, String regexSound){ 
	    	 Pattern pattern = Pattern.compile(regexName);
	    	 Matcher match = pattern.matcher(template);
	    	 return match.replaceAll(regexSound);
	    	 
	     }
	   
//**************************************************************************************************************
	    
	    public static void maxMin(int array[]) {
	    	int max = 0;
			int min = 0;

			for(int i = 0; i < array.length; i++) {
				if(array[i] > array.length) 
					max = array[i];
				else if(array[i] < array.length)
					min = array[i];
					
			}
			System.out.println("Maximum value is = " + max);
			System.out.println("Minimum value is = " + min);
		}
//*******************************************************************************************************************
	    public static int[] bubbleSort(int ar[],int k)
		{
			int i,j;
			for (i = 0; i < k-1; i++)
	            for (j = 0; j < k-i-1; j++)
	                if (ar[j] > ar[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = ar[j];
	                    ar[j] = ar[j+1];
	                    ar[j+1] = temp;
	                }
			return ar;
		}
	    
	    
	    
	    public static void writeAllToFile(String fileName, String content)
	    
		{
			try
			{
				FileWriter filewriter=new FileWriter(fileName);
				BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
				bufferedwriter.write(content);
				bufferedwriter.close();
			}
			catch(FileNotFoundException fileNotFoundException)
			{
				System.out.println("your file is not found in the location '"+fileName+"'");
			}
			catch(IOException ioException)
			{
				System.out.println("Error in reading your file '"+fileName+"'");
			}
		}





		public static String readAllFromFile(String fileName)
		{
			String line=null;
			String readedFile="";
			try 
			{
				FileReader filereader=new FileReader(fileName);
				BufferedReader bufferedReader=new BufferedReader(filereader);
				while((line=bufferedReader.readLine())!= null)
				{
					readedFile+=line;
				}
				bufferedReader.close();
			}
			catch(FileNotFoundException fileNotFoundException)
			{
				System.out.println("your file is not found in the location '"+fileName+"'");
			}
			catch(IOException ioException)
			{
				System.out.println("Error in reading your file '"+fileName+"'");
			}
			return readedFile;

		}
	
}    
    
   