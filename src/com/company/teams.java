package com.company;

/**
 * Created by emimo on 3/11/2017.
 */
public class teams {
        public String name;
        public double winPercent;
        public double strengthOfSchedule;
        public double ppt;
        public double dpt;
        public teams(String n, double w, double d, double p, double de){
            name = n;
            winPercent = w;
            strengthOfSchedule = d;
            ppt=p;
            dpt = de;
        }

        public String getName(){
            return this.name;
        }
        public double getWinPercentage(){
            return this.winPercent;
        }
        public double getStrengthOfSchedule(){
            return this.strengthOfSchedule;
        }
    public double getPpt(){
        return this.ppt;
    }    public double getDpt(){
        return this.dpt;
    }
}
