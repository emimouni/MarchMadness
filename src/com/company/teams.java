package com.company;

/**
 * Created by em343 on 3/8/17.
 */
public class teams {
    public String name;
    public double winPercent;
    public teams(String n, double w){
        name = n;
        winPercent = w;
    }

    public String getName(){
        return this.name;
    }
    public double getWinPercentage(){
        return this.winPercent;
    }
}
