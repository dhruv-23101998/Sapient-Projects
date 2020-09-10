package com.training.games;

public class PlayersRequiredException extends Exception {
	private static final long serialVersionUID=1L;
	private String message;
	public PlayersRequiredException() {
		super();
		this.message="More Players Required";
	}
	public PlayersRequiredException(String message) {
		super(message);
		this.message=message;
	}
	@Override
	public String toString() {
		return "PlayerRequiredException [message="+message+"]";
	}
	@Override
	public String getMessage() {
		return "Message: "+message;
	}
}