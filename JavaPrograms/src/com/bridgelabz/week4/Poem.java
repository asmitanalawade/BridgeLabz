package com.bridgelabz.week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import utility.Utility;

public class Poem {

	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the animal");
		String animal = Utility.inputString();
		System.out.println("Enter the sound");
		String sound = Utility.inputString();
		String file = "/home/admin1/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week4/SamplePoem.txt";
		File fileName = new File(file);
		br = new BufferedReader(new FileReader(fileName));
		String template;
		while((template = br.readLine()) != null){
			
//			System.out.println(template);
		
		
		String regexName = "%ANIMAL%";
		String regexSound = "%SOUND%";
		
		template = Utility.oldMac(template, regexName,animal);
		template = Utility.oldMac(template, regexSound,sound);
		
		System.out.println(" "+template);
		}

	}

}
