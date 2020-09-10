package com.training.games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

 

@SuppressWarnings("unused")
public class LeaderBoard {
    public static void showLeaderBoard(String game,ArrayList<Player> players) {
    	System.out.println("Sorted By Scores");
        TreeMap<String,Double> scores=new TreeMap<String,Double>(Collections.reverseOrder());
        for(int i=0;i<players.size();i++) {
        	Player p=players.get(i);
        	scores.put(p.getName(),p.getScore());
        }
        for(Entry<String,Double> map: scores.entrySet()) {
            System.out.println("Name = " + map.getKey()+", "+game+" = " + map.getValue());               
        }
        System.out.println("Sorted By Name");
        TreeMap<String,Double> scores1=new TreeMap<String,Double>();
        for(int i=0;i<players.size();i++) {
        	Player p=players.get(i);
        	scores1.put(p.getName(),p.getScore());
        }
        for(Entry<String,Double> map: scores1.entrySet()) {
        	System.out.println("Name = " + map.getKey()+", "+game+" = " + map.getValue());  
        }
    }
}