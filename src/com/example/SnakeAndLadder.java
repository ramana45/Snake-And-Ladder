package com.example;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Problem");
		int pos = 0;
		System.out.println("player position : "+pos);
		int die = ((int) (6*Math.random())) + 1;
		System.out.println("die: "+die);
	}
}
