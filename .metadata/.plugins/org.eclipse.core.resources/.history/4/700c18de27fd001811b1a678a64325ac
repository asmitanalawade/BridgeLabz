 package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Util1 {
	static Scanner sc = new Scanner(System.in);

	public static int inputInt() {
		return sc.nextInt();
	}
	
	public static double inputDouble() {
		return sc.nextDouble();
	}
	public static String inputString() {
		return sc.nextLine();
	}

	

	 
	 //**********************************************************************************
	 
	 public static void s1() {
		 System.out.println(" Hello ");

	 }
	// public static void s2() {
	//	 System.out.println(" Hi ");
	// }
	 
//********************************************************************************************
	 
	public static int initial(String name) {
		 int n = 9;
		 int count = 5;
		 int flag = 1;
		 
		  if(name.charAt(0) == 'K') {
			  
			  Util1.kPattern(count);
		  }else if(name.charAt(0)== 'D') {
			  
			  Util1.dpattern(n);
		  }else if(name.charAt(0)== 'W') {
			  Util1.wpattern(n);
		  }else
			  flag =0;
			  
		  return flag;
		 
	}
	 
	 
	 
	 
	 
     //**************************************************************** 
	 public static void kPattern(int count) {
	
		
		 
		 //loop for rows
		 for(int i = 0; i < 10; i++) {
			 //loop for column
				for(int j = 0; j < 2; j++) {
					System.out.print("*");
				}
				
				for(int k = 0; k <= 5; k++) {
					if(k == count) {
						System.out.print("***");
					}else {
						System.out.print("  ");
					}
				}
				//Find the middle 
				if(i <= 4) {
					count--;
				}else if(i <= 9) {
					count++;
				}
				System.out.print("\n");
			}
	 }	 
     //********************************************************	 
	public static void dpattern(int n) {	 
		 
	    
			// TODO Auto-generated method stub
	     //loop for rows
			 for (int i = 0; i < 9; i++){ 
	             
		            // loop for columns 
		            for (int j = 0; j <= n; j++){ 
		                  
		                // Logic to generate stars 
		                // for * 
		                if (j == 1 || ((i == 0 ||  i == n-1) && (j > 1 && j < n-2)) |(j == n-2 && i != 0 &&  i != n-1)) 
		                    System.out.print("**");  
		                      
		                // For the spaces 
		                else
		                    System.out.print("  ");  
		            } 
		              
		        // For changing line 
		        System.out.println(); 
		        } 
			 
	}	  	 
    //*******************************************************
	
	public static void wpattern(int n) {
			 // loop for rows
		 for(int i = 0; i < 9; i++) {
			 // loop for column
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				//loop for sligthly moving column
				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				//loop for sligthly moving column
				for (int l = 1; l <= i; l++) {
					System.out.print("  ");
				}
				for(int j = 0; j <=1; j++) {
					System.out.print("*");
				}
				//loop for  column
				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}

	 }
//********************************************************************************************
	 
	 
	 public static boolean Leap(int year) {
		boolean status;
			
				if(year % 4 == 0) {
					
					if(year % 100 == 0) {
						
						if(year % 400 == 0) {
							 
							status = true;
						}else
							
						status = false;
					}else 
						
					status = true;
				}else {
					 
					status = false;
				}
				return status;

	 }
   //********************************************************************************** 
	 
	 public static int sum(int n) {
	 int a = 1 + (int)(Math.random()*n);
		 System.out.println(a);
			int b = 1 + (int)(Math.random()*n);
			 System.out.println(b);
			  int sum = a + b;
			return sum;
	 }
	
  //***********************************************************************************
	 
	 public static void ran(int n) {
		 //Take 5 random numbers
		 double a = Math.random();
			System.out.println(a);
			double b = Math.random();
			System.out.println(b);
			double c = Math.random();
			System.out.println(c);
			double d = Math.random();
			System.out.println(d);
			double e = Math.random();
			System.out.println(e);
			
			//Find the min, max and average numbers of random number
			double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
			double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
			double average = (a + b + c + d + e)/ 5;
			//Print the min, max and average numbers
			System.out.println("Min = " + min);
			System.out.println("Max = " + max);
			System.out.println("Average = " + average);
	 }
   //********************************************************************************
	 
	 public static boolean day(int d, int m) {
		 // Day d of month m is between march 20 (m = 3, d = 20)
		 //and June 20(m = 6, d = 20) 
		 
		 boolean status = (m == 3 && d >= 20 && d <= 31)||
				          (m == 4 && d >= 1  && d <= 30)||
				          (m == 5 && d >= 1  && d <= 31)||
				          (m == 6 && d >= 1  && d <= 20);
		 return status;
				 
			
			
	 }
	//******************************************************************************** 
	 
	 public static void DayOfWeek(int d, int m, int y) {
		//Calculate the year,leap year, month,day
		 int y0 = y - (14 - m) / 12;
	     int x = y0 + y0/4 - y0/100 + y0/400;
	     int m0 = m + 12 * ((14 - m) / 12) - 2;
	     int d0 = (d + x + (31*m0)/12) % 7;

	       // System.out.println(y0);
	        //System.out.println(x);
	        //System.out.println(m0);
	        //System.out.println(d0);
	     
	        //Print the day of week
	        if(d0 == 0) {
	        	System.out.println("It is Sunday");
	        }else if(d0 == 1) {
	        	System.out.println("It is Monday");
	        }else if(d0 == 2) {
	        	System.out.println("It is Tuesday");
	        }else if(d0 == 3) {
	        	System.out.println("It is Wednesday");
	        }else if(d0 == 4) {
	        	System.out.println("It is Thursday");
	        }else if(d0 == 5) {
	        	System.out.println("It is Friday");
	        }else {
	        	System.out.println("It is Saturday");
	        }
	        
	        

	 }
// *********************************************************************************************
	 
	 public static double Payment(double principal, double rate, double year) {
		 double r = (rate / 100) / 12;   
	        double n = 12 * year;          

	        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
	        
	        return payment;
	 }
//***********************************************************************************************
	 
	 public static double Triag(double degree) {
		 //Convert the degree in radian
		 double radian = Math.toRadians(degree);
			
			double sin = Math.sin(radian);
			double cosine = Math.cos(radian);
			System.out.println("cos("+degree+") = " + cosine);
		    return sin;
			
			
	 }
//********************************************************************************************
	 
	 public static void Temp(double T, int n) {
		 
			if(n == 1) {
				//Convert the temperature in celcius to fahrenhait
				double fahrenheit = (T * (9/2))+32;
				System.out.println("Temperature in celcius to fahrenheit = " + fahrenheit);
			}else if(n == 2) {
				//Convert the temperature in fahrenhait to celcius
				double celcius = (T - 32) * 5/9;
				System.out.println("Temperature in fahrenheit to celcius = " + celcius);
			}
	 }
	 
//*********************************************************************************************
	 
	 public static double sqrtNewtonMtd(double c) {
		 //Initialise t=c
		 double t = c;
		 double  epsilon = 1e-15;
		 //Repeat until desired accuracy reached
		 while(Math.abs(t - c/t) > epsilon*t) {
			 t = (c/t + t)/2.0;
		 }
		return t;
	 }
//*********************************************************************************************
	 
	 public static int binswap(int num)
	  {
		      //Convert decimal number in binary number
				System.out.println("Decimal Number:"+num);
				String bin=Integer.toBinaryString(num);
				System.out.println("Binary Number after conversion:"+bin);
				//Take a length of binary number
				int n=bin.length();
				String  s1 = "0";
				if(n<8) 
				{
					bin = s1.concat(bin);
				}
					
					String nibble1=bin.substring(0, 4);
						System.out.println("Nibble 1:"+nibble1);
						String nibble2=bin.substring(4,8);
						System.out.println("Nibble 2:"+nibble2);
						//Swapping the nibble
						String swappNibble=nibble2.concat(nibble1);
						System.out.println("After swapping nibbles:"+swappNibble);
						int dec=Integer.parseInt(swappNibble,2);
						
				return dec;
				
					
	  }
	 public static void PowerOfTwo(int result) {
		//Find resultant number is power of two or not
		 boolean status;
		if(result % 2 == 1) {
			 status = false;
		 }else {
			 status = true;
		 }
		 if(status) {
			 System.out.println("The resultant number is power of 2");
		 }else {
			 System.out.println("The resultant number is not power of 2");
		 }
	 }


//*****************************************************************************************
	 
	 public static void DecToBin(int n, int i, int j, int bin_num[]) {
		
		 while(n != 0) {
				bin_num[i++] = n % 2;
				n /= 2;
			}
			
			System.out.println("Binary number is: ");
			for(j = i -1; j > 0; j--) {
				System.out.print(bin_num[j]);
			}
			System.out.println("\n");
            
	 }
//********************************************************************************************
	 
	 public static double sinx(double x, int n) {
		// convert x to an angle between -2 PI and 2 PI
	         x = x * (Math.PI /180);
           System.out.println("x = " + x);
	        // compute the Taylor series approximation
           // ith term = x^i / i!
	        double term = 1.0;  
	     // sum of first i terms in taylor series
	        double sum  = 0.0;      
            
	        for (int i = 1; i <= n; i++) {
	        	if(term != 0.0) {
	        		// Find odd number
	        		if(i % 2 == 1) {
	        	  double numerator = Math.pow(x, i);
	        	  System.out.println("Numerator: " + numerator);
	        	  double denominator = Util1.factorial(i);
	        	  System.out.println("Denominator: " + denominator);
	              term = term * (numerator / denominator);
	        		}
	        	//Sign operator for odd number	
	              if (i % 4 == 1) 
	               	sum = sum + term;
	              if (i % 4 == 3) 
	            	sum = sum - term;
	             
	        	}
	        }
	        return sum;
	 }
	 
	 //********************************************************
	 
	 public static double cosx(double x1, int m) {
		// convert x to an angle between -2 PI and 2 PI
         x1 = x1 * (Math.PI/180);
       System.out.println("x1 = " + x1);
        // compute the Taylor series approximation
        // ith term = x^i / i!
        double term = 1.0; 
        // sum of first i terms in taylor series
        double sum  = 0.0;     
        
        for (int i = 1; i <= m; i++) {
        	if(term != 0.0) {
        		// Find even number
        		if(i % 2 == 0) {
        	  double numerator = Math.pow(x1, i);
        	  System.out.println("Numerator: " + numerator);
        	  double denominator = Util1.factorial(i);
        	  System.out.println("Denominator: " + denominator);
              term = term * (numerator / denominator);
        		}
        	// Sign operator for even number	
              if (i % 4 == 0) 
               	sum = sum + term;
              if (i % 4 == 2) 
            	sum = sum - term;
             
        	}
        }
        return sum;
		 
	 }
	//********************************************************* 
	 public static double factorial(int n) {
		 int factorial = 1;
         for(int i = 1; i <= n; i++ ) {
			
			factorial = factorial * i;
			
			
			
		}
	     
	      return factorial;
	}

//********************************************************************************************
	 
	 public static int checkRepeated(int arr[], int size)
		
		{	
			int count = 0, curr_cnt = 1, freq_num = 0, key = 0;
		for(int i = 0; i < size-1; i++)
		{
		     key = arr[i];
		     
		     for(int j =i+1; j < size; j++)
		     {
		    	 //Check repeat number
		         if(key == arr[j] && freq_num != key)
		         {
		             curr_cnt++;
		         }
		     }
		     //check current count greater than count
		     if(count < curr_cnt)
		     {
		         count = curr_cnt;
		         curr_cnt = 1;
		         freq_num = key;
		     }
		}
		return freq_num;
			
	}	
//*******************************************************************************************
	 
	 public static void Repeatnum(int n, int array[]) {
		 for(int i = 0; i < n-1; i++) {
				for(int j = i+1; j < n; j++) {
					//Compare two array
					if(array[i] == array[j])
						System.out.println("Repeat number is: " + array[j]);
				}
			}
		
	 }
//*********************************************************************************************
	 
	 public static int Largest(int n, int array[]) {
		 //Print second largest number 
		 // Initialize the largest and second largest number to 0 position in array
		 int largest = array[0];
			int secondLargest = array[0];
			for(int i = 0; i < n; i++) {
				//Find the largest number in array[i]
				if(array[i] > largest) {
					secondLargest = largest;
					largest = array[i];
					//Find the second largest number in array[i]
				}else if(array[i] > secondLargest) {
					secondLargest = array[i];
					
				}	
			}
			return secondLargest;
	 }
	
	 public static int Smallest(int n, int array[]) {
		 //Print second smallest number
		 // Initialize the smallest second smallest number
			int smallest = 0;
			int secondSmallest = 0;
			for(int i = 0; i < n; i++) {
				//Compairing ith element with smallest number
				if(array[i] == smallest) {
					secondSmallest = smallest;
					//Find the smallest number in array[i]
				}else if(array[i] < smallest) {
					secondSmallest = smallest;
					smallest = array[i];
					//Find the second smallest number in array[i]
				}else if(array[i] < secondSmallest){
					secondSmallest = array[i];
					
				}
				
			}
			return secondSmallest;
	 }	
//********************************************************************************************
	 public static void showLines(String fileName, int startLine, int endLine) 
		{
			String line = null;
			int currentLineNo = 1;

			try {
					BufferedReader in = new BufferedReader (new FileReader(fileName));				
					//read to startLine
					while(currentLineNo<startLine) 
					{
						if (in.readLine()==null)
						{
							throw new IOException("File too small");
						}
						currentLineNo++;
					}		
					//read until endLine
					while(currentLineNo<=endLine) 
					{
						line = in.readLine();
						if (line==null) 
						{
							return;
						}
						//System.out.println(line);
						String str = line;
						
						String newstr = str.replaceAll("0", " ");
						
						String newstr1 = newstr.replaceAll("1", "*");
						System.out.println(newstr1);
						currentLineNo++;
						
					}
					
//					String str = line;
//					System.out.println(str);
				} 
				catch (IOException ex) 
				{
					System.out.println("Problem reading file.\n" + ex.getMessage());
				} 
		}
}
