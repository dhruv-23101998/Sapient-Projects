package com.training.games;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Game[] games=new Game[5];
		games[0]=new OfflineGames(100,200,new String[] {"Bat","Ball"},11);
		games[1]=new OfflineGames(100,200,new String[] {"Carrom Board"},4);
		games[2]=new OfflineGames(100,200,new String[] {"Football"},11);
		games[3]=new OfflineGames(100,200,new String[] {"Chinese Checker Board"},6);
		games[4]=new OfflineGames(100,200,new String[] {"Chess Board"},2);
		ArrayList<Double> currentStack=new ArrayList<Double>();
		ArrayList<String> currentHand=new ArrayList<String>();
		ArrayList<Double> buyin=new ArrayList<Double>();
		ArrayList<Player> players=new ArrayList<Player>();
		players.add(new Player("Dhruv"));
		players.add(new Player("Ankit"));
		currentHand.add("RoyalFlush");
		currentHand.add("FullHouse");
		currentStack.add((double) 200);
		currentStack.add((double) 200);
		buyin.add((double) 200);
		buyin.add((double) 200);
		Game poker=new Poker("Dhruv","India",2,buyin,currentHand,currentStack,players);
		PlayGame.play(poker);
		players.clear();
		players.add(new Player("Dhruv"));
		players.add(new Player("Ankit"));
		Game carrom=new Carrom(3, 100, 100, new String[] { "Striker", "Board" }, 3, "Carrom",players);
        PlayGame.play(carrom);
	}
}