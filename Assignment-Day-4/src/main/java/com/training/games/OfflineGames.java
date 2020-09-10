package com.training.games;

public class OfflineGames extends Game {
	private int dimensionLength;
	private int dimensionBreadth;
	private String[] equipments;
	public OfflineGames() {
	}
	public OfflineGames(int dimensionLength, int dimensionBreadth, String[] equipments,int noOfPlayer) {
		super(noOfPlayer);
		this.dimensionLength = dimensionLength;
		this.dimensionBreadth = dimensionBreadth;
		this.equipments = equipments;
	}
	public OfflineGames(int dimensionLength, int dimensionBreadth, String[] equipments,int noOfPlayer,String name) {
		super(noOfPlayer,name);
		this.dimensionLength = dimensionLength;
		this.dimensionBreadth = dimensionBreadth;
		this.equipments = equipments;
	}
	public int getDimensionLength() {
		return dimensionLength;
	}
	public int getDimensionBreadth() {
		return dimensionBreadth;
	}
	public String[] getEquipments() {
		return equipments;
	}
	public void meetPhysical() {
		System.out.println("You Have To Be In Playground....");
	}
	@Override
	public void start() {
		System.out.println("Game Starts In Offline Mode....");
	}
	@Override
	public void stop() {
		System.out.println("Game Stops In Offline Mode....");
	}
	@Override
	public void rule() {
		System.out.println("Game Rules For Offline Playing....");
	}
}