
/**
 * Purpose : This program take the input from the user animal and sound and print 
 *    the lyrics of the poem Old MacDonald had a farm, replace ANIMAL and its SOUND 
 *    to output the complete the lyrics.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   6/12/2018          
 */

package com.bridgelabz.week3;

import utility.Utility;

public class OldMacDonald {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the animal");
		String animal = Utility.inputString();
		System.out.println("Enter the sound");
		String sound = Utility.inputString();
		
		String template = "Old MacDonald had a farm \n"
				         +"E­-I­-E­-I­-O" + ".\n"
				
				         +"And on his farm he had some '%ANIMAL%',\n"
				         +"E­-I­-E-­I­-O.\n"
				
				         +"With a %SOUND%, %SOUND% here,\n"
				         +"And a %SOUND%, %SOUND% there,\n"
				        + "Here a %SOUND%, there a %SOUND%,\n"
				          +"Everywhere a %SOUND%, %SOUND%";
		
		
		
		String regexName = "%ANIMAL%" ;
		String regexSound = "%SOUND%";
		
		template = Utility.poem(template, regexName, animal);
		template = Utility.poem(template, regexSound, sound);
		System.out.println(template);

	}

}
