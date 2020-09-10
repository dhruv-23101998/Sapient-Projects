package com.training.games;

public class PokerException extends Exception implements GameException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
    
    public PokerException() {
        this.msg = "Poker Exception - Message Not Given";
    }

 

    public PokerException(String msg) {
        this.msg = msg;
    }

 

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "PokerException [message=" + msg + "]";
    }

 

    public String getMsg() {
        return "getMessage :" + this.msg;
    }
    
    
}