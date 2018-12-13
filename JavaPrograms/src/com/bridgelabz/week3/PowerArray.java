package com.bridgelabz.week3;

public class PowerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n = Integer.parseInt(args[0]);
          int a[] = new int[n];
          int power = 1;
          int i = 0;
//          while(i < n) {
//        	  System.out.print(power + " ");
//        	  power = power * 2;
//        	  i++;
//          }
        for(i = 0; i < n; i++) {
        	a[i] = i;
        	power = power * 2;      	
        	
        }
        System.out.println("Power of 2^n is: " + power);
        int num = power;
        int digit1, digit2, digit3,digit4;
        
        digit1 = num%10;
        
        num = num/10;
        
        digit2 = num%10;
        
        num = num/10;
        
        digit3 = num%10;
        
        num = num/10;
        
        digit4 = num%10;
        
        num/=10;
        
        System.out.println("Unit digit is " + digit1);
        System.out.println("Tens digit is " + digit2);
        System.out.println("Hundred digit is " + digit3);
        System.out.println("Thousand digit is " + digit4);	
        
        String result[][] = new String [2][4];
        result[0][0] = "U";
        result[0][1] = "T";
        result[0][2] = "H";
        result[0][3] = "Th";

        result[1][0] = Integer.toString(digit1);
        result[1][1] = Integer.toString(digit2);
        result[1][2] = Integer.toString(digit3);
        result[1][3] = Integer.toString(digit4);
        
        System.out.println("Result in 2D array: ");
        for(int j=0; j< 2; j++) {
        	
        	for(int k=0; k<4; k++) {
        		
        		System.out.print( result[j][k]+ " ");
        	}
        	System.out.println();
        }
        
        
 	}

}
