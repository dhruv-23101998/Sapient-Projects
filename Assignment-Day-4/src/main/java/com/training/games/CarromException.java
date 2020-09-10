package com.training.games;

public class CarromException extends Exception implements GameException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
    
    public CarromException() {
        this.msg = "Carrom Exception - Message Not Given";
    }

 

    public CarromException(String msg) {
        this.msg = msg;
    }

 

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "CarromException [message=" + msg + "]";
    }

 

    public String getMsg() {
        return "getMessage :" + this.msg;
    }
    
    
}