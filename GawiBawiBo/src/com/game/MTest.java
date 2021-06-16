package com.game;

public class MTest extends Referee{
	
	public static void main(String[] args) {
		
		int cnt = 0;
		
		AI ai = new AI();
		Player player = new Player();
		System.out.println("Gawi Bawi Bo Game!!!");
		
		do {
			ai.setSelect();
			player.setSelect();
			
			System.out.printf("AI : %s vs Player : %s\n", ai.getHand(),player.getHand());
			System.out.println("Result : " + isWin(ai.getSelect(),player.getSelect()));
			
			cnt++;
		} while(cnt <= 10000);
	}
}
