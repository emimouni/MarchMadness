package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner txt = new Scanner("Teams.txt");
        ArrayList<teams> South = new ArrayList<teams>();
        ArrayList<teams> East = new ArrayList<teams>();
        ArrayList<teams> Midwest = new ArrayList<teams>();
        ArrayList<teams> West = new ArrayList<teams>();


        while(txt.hasNextLine()){
            String s = txt.nextLine();
            String name = s.substring(0,s.indexOf("\t"));
            String y = s.substring(s.indexOf("\t") + 1);
            double winPercentage = Double.parseDouble(y);
            teams x = new teams(name, winPercentage);
            South.add(x);
        }
        while(txt.hasNextLine()){
            String s = txt.nextLine();
            String name = s.substring(0,s.indexOf("\t"));
            String y = s.substring(s.indexOf("\t") + 1);
            double winPercentage = Double.parseDouble(y);
            teams x = new teams(name, winPercentage);
            East.add(x);
        }
        while(txt.hasNextLine()){
            String s = txt.nextLine();
            String name = s.substring(0,s.indexOf("\t"));
            String y = s.substring(s.indexOf("\t") + 1);
            double winPercentage = Double.parseDouble(y);
            teams x = new teams(name, winPercentage);
            Midwest.add(x);
        }
        while(txt.hasNextLine()){
            String s = txt.nextLine();
            String name = s.substring(0,s.indexOf("\t"));
            String y = s.substring(s.indexOf("\t") + 1);
            double winPercentage = Double.parseDouble(y);
            teams x = new teams(name, winPercentage);
            West.add(x);
        }

        txt.close();
    }
    public static void nextRound(ArrayList e){
        for (int j = 0; j<16; j++){
            teams dummy  = (teams)e.get(0);
            double x = dummy.getWinPercentage();
            teams dummy1 = (teams)e.get(1);
            double y = dummy1.getWinPercentage();
            if (x>y){
                e.remove(y);
            }else{
                e.remove(x);
            }
        }
    }
    public static void printRound(ArrayList a,ArrayList b,ArrayList c,ArrayList d){
        int x = 64;
        System.out.println("Round of " + x);
        for (int i = 0; i<a.size(); i++){
            System.out.println(((teams)a.get(i)).getName());
        }
    }
}
