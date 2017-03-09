package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner txt = new Scanner(new File ("Teams.txt"));
        ArrayList<teams> South = new ArrayList<teams>();
        ArrayList<teams> East = new ArrayList<teams>();
        ArrayList<teams> Midwest = new ArrayList<teams>();
        ArrayList<teams> West = new ArrayList<teams>();



        for (int i = 0; i<16; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            double winPercentage = Double.parseDouble(a);
            teams x = new teams(name, winPercentage);
            South.add(x);
        }
        for (int i = 16; i<32; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            double winPercentage = Double.parseDouble(a);
            teams x = new teams(name, winPercentage);
            East.add(x);
        }
        for (int i = 32; i<48; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            double winPercentage = Double.parseDouble(a);
            teams x = new teams(name, winPercentage);
            Midwest.add(x);
        }
        for (int i = 48; i<64; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            double winPercentage = Double.parseDouble(a);
            teams x = new teams(name, winPercentage);
            West.add(x);
        }
        int e = 32;
        nextRound(South);
        nextRound(East);
        nextRound(Midwest);
        nextRound(West);
        System.out.println(" ");
        printRound(South,East,Midwest,West,e);
        e/=2;
        nextRound(South);
        nextRound(East);
        nextRound(Midwest);
        nextRound(West);
        System.out.println(" ");
        printRound(South,East,Midwest,West,e);
        e/=2;
        nextRound(South);
        nextRound(East);
        nextRound(Midwest);
        nextRound(West);
        System.out.println(" ");
        printRound(South,East,Midwest,West, e);
        e/=2;
        nextRound(South);
        nextRound(East);
        nextRound(Midwest);
        nextRound(West);
        System.out.println(" ");
        printRound(South,East,Midwest,West, e);
        e/=2;
        nextRound(South);
        nextRound(East);
        nextRound(Midwest);
        nextRound(West);
        printRound(South,East,Midwest,West, e);
        System.out.println(" ");

        txt.close();
    }
    public static void nextRound(ArrayList e){
        for (int j = 0; j<16; j++){
            teams dummy  = (teams)e.get(j);
            double x = dummy.getWinPercentage();
            teams dummy1 = (teams)e.get(j+1);
            double y = dummy1.getWinPercentage();
            if (x>y){
                e.remove(y);
            }else{
                e.remove(x);
            }
        }
    }
    public static void printRound(ArrayList a,ArrayList b,ArrayList c,ArrayList d, int x){
        System.out.println("Round of " + x);
        for (int i = 0; i<a.size(); i++){
            System.out.println(((teams)a.get(i)).getName());
        }
        for (int i = 0; i<b.size(); i++){
            System.out.println(((teams)a.get(i)).getName());
        }
        for (int i = 0; i<c.size(); i++){
            System.out.println(((teams)a.get(i)).getName());
        }
        for (int i = 0; i<d.size(); i++){
            System.out.println(((teams)a.get(i)).getName());
        }
    }
}
