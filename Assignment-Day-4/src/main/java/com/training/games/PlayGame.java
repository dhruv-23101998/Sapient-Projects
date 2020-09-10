package com.training.games;
import com.training.game.utils.*;

public class PlayGame {
	public static void play(Game game) {
		System.out.println("Game Name: "+game.getName());
		game.start();
		game.rule();
		 try {
	            Util.playersValidity(game.getName(), game.getNoOfPlayer());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		if(game instanceof Poker) {
			((Poker)game).printAvgPotAndAvgStack();
			System.out.println(((Poker)game).getWinnings());
			((Poker)game).getLeaderBoard();
		}
		else if (game instanceof Carrom) {
            ((Carrom)game).updateScores(10.00,"Dhruv");
            ((Carrom)game).updateScores(20.00,"Ankit");
            ((Carrom)game).getLeaderBoard();
        }
		else if(game instanceof OnlineGames)
			((OnlineGames)game).meetVirtual();
		else if(game instanceof OfflineGames)
		((OfflineGames)game).meetPhysical();
		game.stop();
	}
}