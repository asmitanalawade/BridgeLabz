package com.bridgelabz.week3;

import java.util.ArrayList;

import com.bridgelabz.week1.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] ranks = {"2", "3", "4", "5","6", "7", "8", "9","10",
				            "Ace", "Jack", "King","Queen"};
		
		//Initialize deck
		int n = suits.length * ranks.length;
		String[] deck = new String[n];
		for(int i = 0; i < ranks.length; i++) {
			for(int j = 0; j < suits.length; j++) {
				 deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
			}
		}
		
		//Shuffle
		for (int i = 0; i < n; i++) {
	        int rd = i + (int) (Math.random() * (n-i));
	        String temp = deck[rd];
	        deck[rd] = deck[i];
	        deck[i] = temp;
		}
		
		//Print shuffle deck
		
		for(int i = 0; i < 4; i++) {
			System.out.println("** Person" + (i+1) + "**");
			for (int j = 0; j < 9; j++) {
		        System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
		    }
		}
	}

}
