package com.training.games;

import java.util.ArrayList;

public class Poker extends OnlineGames {
	private ArrayList<Double> currentStack;
	private ArrayList<String> currentHand;
	private ArrayList<Double> buyin;
	private ArrayList<Player> players;
	public Poker() {
		super();
	}
	public Poker(String username, String region,int noOfPlayer,ArrayList<Double> buyin,ArrayList<String> currentHand,ArrayList<Double> currentStack,ArrayList<Player> players) {
		super(username,region,noOfPlayer,"Poker");
		if(noOfPlayer<2 || noOfPlayer>10) {
			try {
				throw new PlayersRequiredException("No Of Player Should Be Between 2 To 10");
			} catch(PlayersRequiredException pre) {
				pre.printStackTrace();
			}
		}
		this.buyin=buyin;
		this.players=players;
		this.currentHand=currentHand;
		this.currentStack=currentStack;
	}
	@Override
	public void start() {
		System.out.println("Game Started, Choose Your Buyin");
	}
	@Override
	public void stop() {
		System.out.println("Betting Round Over");
	}
	@Override
	public void rule() {
		System.out.println("Rules For Texas No Limit Holdem Can Be Found Here");
	}
	public void printAvgPotAndAvgStack() {
		System.out.println("Avg Pot: 227, Avg Stack: 642");
	}
	public String getWinnings() {
		for(int i=0;i<players.size();i++) {
			double score=0.0;
			Player p=new Player(players.get(i).getName());
			if(currentHand.get(i).equals("RoyalFlush"))
				score=currentStack.get(i)+buyin.get(i);
			p.setScore(score);
			players.set(i,p);
		}
		String ans="";
		for(int i=0;i<players.size();i++)
			ans+=players.get(i).getName()+" Winnings = "+players.get(i).getScore()+"\n";
		return ans;
	}
}