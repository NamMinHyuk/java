package com.game;

public class Referee {
	/*		player
	  	  0  1  2
	 ai 0 
	    1 
	 	2
	 
	 */
	public static String isWin(int ai, int player) {
		
		String[][] winDrawLose = {
				{"draw","win","lose"},
				{"lose","draw","win"},
				{"win","lose","draw"},
		};	
		
		return winDrawLose[ai][player];
	}
}
