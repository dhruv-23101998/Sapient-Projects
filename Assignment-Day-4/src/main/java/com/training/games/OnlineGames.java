package com.training.games;

public abstract class OnlineGames extends Game {
	private String username;
	private String region;
	public OnlineGames() {
		super();
	}
	public OnlineGames(String username, String region,int noOfPlayer) {
		super(noOfPlayer);
		this.username = username;
		this.region = region;
	}
	public OnlineGames(String username, String region,int noOfPlayer,String name) {
		super(noOfPlayer,name);
		this.username = username;
		this.region = region;
	}
	public String getUsername() {
		return username;
	}
	public String getRegion() {
		return region;
	}
	public void meetVirtual() {
		System.out.println("You Can Be Anywhere....");
	}
}