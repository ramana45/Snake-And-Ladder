package com.example;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Problem");
		int pos1 = 0,pos2 = 0, count1 = 0,count2 = 0;
		System.out.println("Initial position of player1 : "+pos1);
		System.out.println("Initial position of player2 : "+pos2);
		while(pos1<=100 && pos2<=100) {
			int die1 = ((int) (6*Math.random()))+1;
			int play1 = (int) (3*Math.random());
			//System.out.println("player1 position : "+pos1);
			System.out.println("die1: "+die1);
			count1++;
		
				if (play1 == 0) {
					System.out.println("No Play");
				}
				else if(play1 == 1) {
					System.out.println("Ladder");
					pos1 += die1;
					if(pos1 == 100)
						break;
					else if(pos1 > 100)
						pos1 -= die1;
					}
				else {
					System.out.println("Snake");
					pos1 -= die1;
					if(pos1 <= 0)
						pos1 = 0 ;
				}
			
				System.out.println("player1 position : "+pos1);
				if(pos1 == 100) {
					System.out.println("Player 1 wins the game");
					break;
				}
				
				int die2 = ((int) (6*Math.random()))+1;
				int play2 = (int) (3*Math.random());
				
				System.out.println("die2: "+die2);
				count2++;
			
					if (play2 == 0) {
						System.out.println("No Play");
					}
					else if(play2 == 1) {
						System.out.println("Ladder");
						pos2 += die2;
						if(pos2 == 100)
							break;
						else if(pos2 > 100)
							pos2 -= die2;
					}
					else {
						System.out.println("Snake");
						pos2 -= die2;
						if(pos2 <= 0)
							pos2 = 0 ;
					}
					System.out.println("player2 position : "+pos2);
					if(pos2 == 100) {
						System.out.println("Player 2 wins the game");
						break;
					}
			}
		System.out.println("Player1 final position : "+pos1);
		System.out.println("Player2 final position : "+pos2);
		//System.out.println("Number of times die rolled was : "+count2);
	}
}
