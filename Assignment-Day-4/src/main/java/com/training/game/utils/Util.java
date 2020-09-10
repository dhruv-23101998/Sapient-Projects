package com.training.game.utils;

import com.training.games.CarromException;
import com.training.games.PokerException;

 

public class Util{
    public static void playersValidity(String game,int noOfPlayers) throws Exception {
        AllGames gameEnum = Enum.valueOf(AllGames.class, game.toUpperCase());
        if(AllGames.CARROM == gameEnum) {
            if (noOfPlayers > 4) {
                throw new CarromException("No of Players too many for carrom");
            }
            else if(noOfPlayers < 2) {
                throw new CarromException("No of Players too less for carrom");
            }
        }
        else if(AllGames.POKER == gameEnum) {
            if (noOfPlayers < 2 || noOfPlayers > 10) {
                throw new PokerException("No of Players invalid for Poker");
            }
        }
    }
}