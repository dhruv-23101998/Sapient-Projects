package com.training.games;

public abstract class Game {
	private String name;
	private int noOfPlayer;
	public Game() {
	}
	public Game(int noOfPlayer) {
		super();
		this.name="No Name";
		this.noOfPlayer=noOfPlayer;
	}
	public Game(int noOfPlayer,String name) {
		super();
		if(noOfPlayer<=0) {
			try {
				throw new PlayersRequiredException("No Of Players Not Matching "+noOfPlayer);
			} catch(PlayersRequiredException pre) {
				pre.printStackTrace();
			}
		}
		if(name.length()<5) {
			try {
				throw new RuntimeException("Name Cannot Be Less Than 5 Characters");
			} catch(RuntimeException re) {
				re.printStackTrace();
				this.name="No Name";
			}
		}
		else {
			this.name=name;
			this.noOfPlayer=noOfPlayer;
		}
	}
	public String getName() {
		return name;
	}
	public int getNoOfPlayer() {
		return noOfPlayer;
	}
	public abstract void start();
	public abstract void stop();
	public abstract void rule();
}