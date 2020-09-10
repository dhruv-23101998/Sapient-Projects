package com.training.games;

public class Player {
    String name;
    double score;
    public Player(String name) {
        super();
        this.name=name;
        this.score=0.0;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}