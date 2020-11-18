package com.example;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Problem");
		int pos = 0;
		int die = ((int) (6*Math.random()))+1;
		int play = (int) (3*Math.random());
		System.out.println("player position");
		System.out.println("die: "+die);
		if (play==0) {
			System.out.println("No Play");
		}
		else if(play==1) {
			System.out.println("Ladder");
			pos += die;
		}
		else {
			System.out.println("Snake");
			pos = pos - die;
		}
			
	}
}
