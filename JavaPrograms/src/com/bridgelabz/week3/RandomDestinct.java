package com.bridgelabz.week3;




import java.util.ArrayList;
import java.util.Collections;

public class RandomDestinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList num = new ArrayList();
		
		for(int i = 0; i < 20; i++) {
			num.add(i+1);
			//System.out.println(num);
		}
		Collections.shuffle(num);
		
		System.out.println(num);
		
		
		
	}

}
