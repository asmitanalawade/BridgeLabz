package com.bridgelabz.week3;

import utility.Utility;

public class TicTacToe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char m[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		char player,computer;
		System.out.println("Enter the choice 'x' or 'O'");
		player = Utility.inputString().charAt(0);
		
		if(player == 'x') {
			computer = 'O';
		}else {
			computer = 'x';
		}
		draw(m,player,computer);
		play(m,player,computer);
		
	}
	//Print the board
	public static void draw(char m[][],char player,char computer) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//System.out.print(m[i][j] + '|');
				//System.out.println();
			}
			//System.out.println();
			System.out.println("|_|_|_|");
		}
		
	}
	
	public static void play(char m[][], char player, char computer) {
		System.out.println(player + " player turn");
		System.out.println(computer + " computer turn");
		char count = 1;
		while(count <= 9) {
			//Count is even player turn
			if(count%2 != 0) {
				System.out.println("Player turn \n Enter your choice");
				while(count%2 != 0) {
					char p = Utility.inputString().charAt(0);
					
					for(int i = 0; i < 3; i++) {
						for(int j = 0; j < 3; j++) {
							if(p == m[i][j]) {
								m[i][j] = player;
								count++;
							}
						}
					}
				}
			}
			//Computer turn
			if(count%2 == 0) {
				while(count%2 == 0) {
					int n =(int)(Math.random()*8+1);
					char c = (char)(n +'0');
					//Here, we used '0' because chars are actually represented by ASCII values.
					//'0' is a char and represented by the value of 48.
					 System.out.println(c);
				    for(int i=0;i<3;i++) 
					  {
						  for(int j=0;j<3;j++)
						  {
					        if(c == m[i][j])
					         {
						     m[i][j] = computer;
						      count++;
					          }
				            }
			            }
				       }
				}
		   draw(m,player,computer);
		   char win=checkwin(m,player,computer,count);
		    if(win==player)
		    { 
			System.out.println("Congratulatios ! player win");
			break;
		    }
		    if(win==computer)
		    {
			System.out.println("Congratulation ! computer win");
			break;
		    }
		    }
	}
	
	public static char checkwin(char mat[][],char player,char computer,int count)// check wining condition
	{
		if(mat[0][0]==player&&mat[0][1]==player&&mat[0][2]==player)
		{
			return player;
			
		}
		if(mat[1][0]==player && mat[1][1]==player &&mat[1][2]==player)
		{
			return player;
		}
		if(mat[2][0]==player&&mat[2][1]== player&& mat[2][2]== player )
		{
			return player;
		}
		if(mat[0][0]==computer&&mat[0][1]==computer&&mat[0][2]==computer)
		{
			return computer;
		}
		if(mat[1][0]==computer&&mat[1][1]==computer&&mat[1][2]==computer)
		{
			return computer;
		}
		if(mat[2][0]==computer&&mat[2][1]==computer&&mat[2][2]==computer)
		{
			return computer;
		}
		if(mat[0][0]==player&&mat[1][0]==player&&mat[2][0]==player)
		{
			return player;
			
		}
		if(mat[0][1]==player&&mat[1][1]== player&& mat[2][1]== player )
		{
			return player;
		}
		if(mat[0][2]==player && mat[1][2]==player &&mat[2][2]==player)
		{
			return player;
		}
		
		if(mat[0][0]==computer&&mat[1][0]==computer&&mat[2][0]==computer)
		{
			return computer;
		}
		if(mat[0][1]==computer&&mat[1][1]==computer&&mat[2][1]==computer)
		{
			return computer;
		}
		if(mat[0][2]==computer&&mat[1][2]==computer&&mat[2][2]==computer)
		{
			return computer;
		}
		if(mat[0][0]==player&&mat[1][1]==player&&mat[2][2]==player)
		{
			return player;
		}
		if(mat[0][0]==computer && mat[1][1]==computer && mat[2][2]==computer)
		{
			return computer;
		}
		if(mat[0][2]==computer && mat[1][1]==computer && mat[2][0]==computer)
		{
			return computer;
		}
		if(mat[0][2]==player && mat[1][1]==player && mat[2][0]==player)
		{
			return player;
		}
		if(count==9)
		{
		return 'd';
		}
		return 'b';
	

					
				
			
		
		
	}

}