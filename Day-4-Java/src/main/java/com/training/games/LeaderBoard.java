package com.training.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

 

@SuppressWarnings("unused")
public class LeaderBoard {
    public static void showLeaderBoard(String game,ArrayList<Player> players) {
        int size= players.size();
        TreeMap<String,Double> scores=new TreeMap<String,Double>();
        for(int i=0;i<players.size();i++) {
        	Player p=players.get(i);
        	scores.put(p.getName(),p.getScore());
        }
        for(Entry<String,Double> map: scores.entrySet()) {
            System.out.println("Name=" + map.getKey() +  
                    ", Score = " + map.getValue());               
        } 
    }
}