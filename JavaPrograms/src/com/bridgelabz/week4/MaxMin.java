package com.bridgelabz.week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class MaxMin {

	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week4/maxmin.txt";
		File fileName = new File(file);
		br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while(line != null){
			
		System.out.println(line);
		break;
		
		
		int n = line.length();
		int array[] = new int[n];
		int max = 0;
		int min = 0;
		Utility.maxMin(n, array, max, min);
		}
	}

}
