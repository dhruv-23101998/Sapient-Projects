package com.training.games;

import java.util.ArrayList;

public class Carrom extends OfflineGames {
    private int strikerSize;
    private ArrayList<Player> players;
    public Carrom() {
    }
    public Carrom(int strikerSize, int dimentionLength, int dimentionBreadth, String[] equipments, int noOfPlayers,
            String name,ArrayList<Player> players) {
        super(dimentionLength, dimentionBreadth, equipments, noOfPlayers, name);
        this.players=players;
        this.strikerSize = strikerSize;
    }
    public void updateScores(double val,String playerName) {
    	for(int i=0;i<players.size();i++)
    		if(players.get(i).getName().equals(playerName))
    		{
    			System.out.println("sfdh");
    			Player p=new Player(playerName);
    			p.setScore(players.get(i).getScore()+val);
    			players.set(i,p);
    		}
    }
    public int getStrikerSize() {
        return strikerSize;
    }
    @Override
    public void start() {
        System.out.println("Starting Carrom Game");
    }
    @Override
    public void stop() {
        System.out.println("Ending Carrom Game");
    }
    @Override
    public void rule() {
        System.out.println("Put the highest number of points worth coins using the striker");
    }
    public void getLeaderBoard() {
		LeaderBoard.showLeaderBoard("Score",players);
	}
}