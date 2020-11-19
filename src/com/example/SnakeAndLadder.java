package com.example;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Problem");
		int pos = 0;
		while(pos<=100) {
			int die = ((int) (6*Math.random()))+1;
			int play = (int) (3*Math.random());
			System.out.println("player position : "+pos);
			System.out.println("die: "+die);
		
				if (play==0) {
					System.out.println("No Play");
				}
				else if(play==1) {
					System.out.println("Ladder");
					pos += die;
					if(pos == 100)
						break;
					else if(pos>100)
						pos-=die;
				}
				else {
					System.out.println("Snake");
					pos -= die;
					if(pos<=0)
						pos = 0 ;
				}
			}
		System.out.println("Player final position : "+pos);

	}
}
