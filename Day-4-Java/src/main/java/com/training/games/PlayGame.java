package com.training.games;

public class PlayGame {
	public static void play(Game game) {
		System.out.println("Game Name: "+game.getName());
		game.start();
		game.rule();
		if(game instanceof Poker) {
			((Poker)game).printAvgPotAndAvgStack();
			System.out.println(((Poker)game).getWinnings());
		}
		else if(game instanceof OnlineGames)
			((OnlineGames)game).meetVirtual();
		else if(game instanceof OfflineGames)
		((OfflineGames)game).meetPhysical();
		game.stop();
	}
}