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
            String b = z[2];
            String c = z[3];
            String d = z[4];
            double ppt = Double.parseDouble(c);
            double dpt = Double.parseDouble(d);
            double winPercentage = Double.parseDouble(a);
            double schedStrength = Double.parseDouble(b);
            teams x = new teams(name, winPercentage, schedStrength, ppt, dpt);
            South.add(x);
        }
        for (int i = 16; i<32; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            String b = z[2];
            String c = z[3];
            String d = z[4];
            double ppt = Double.parseDouble(c);
            double dpt = Double.parseDouble(d);
            double winPercentage = Double.parseDouble(a);
            double schedStrength = Double.parseDouble(b);
            teams x = new teams(name, winPercentage, schedStrength, ppt, dpt);
            East.add(x);
        }
        for (int i = 32; i<48; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            String b = z[2];
            String c = z[3];
            String d = z[4];
            double ppt = Double.parseDouble(c);
            double dpt = Double.parseDouble(d);
            double winPercentage = Double.parseDouble(a);
            double schedStrength = Double.parseDouble(b);
            teams x = new teams(name, winPercentage, schedStrength, ppt, dpt);
            Midwest.add(x);
        }
        for (int i = 48; i<64; i++){
            String s = txt.nextLine();
            String[] z = s.split("\\s+");
            String name = z[0]; //team
            String a  = z[1]; //win percent
            String b = z[2];
            String c = z[3];
            String d = z[4];
            double ppt = Double.parseDouble(c);
            double dpt = Double.parseDouble(d);
            double winPercentage = Double.parseDouble(a);
            double schedStrength = Double.parseDouble(b);
            teams x = new teams(name, winPercentage, schedStrength, ppt, dpt);
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
        ArrayList<teams> last = new ArrayList<teams>();
        last.add((South.get(0)));
        last.add(East.get(0));
        last.add(Midwest.get(0));
        last.add(West.get(0));
        nextRound(last);
        System.out.println(" ");
        printFinalFour(last, e);
        nextRound(last);
        e/=2;
        System.out.println(" ");
        printFinalFour(last, e);

        txt.close();
    }
    public static ArrayList nextRound(ArrayList e){
        for (int j = 0; j<e.size()-1; j++){
            teams dummy  = (teams)e.get(j);
            double x = dummy.getWinPercentage() * dummy.getStrengthOfSchedule();
            double z = (dummy.getPpt() + dummy.getDpt()) / 200;
            x/=z;
            teams dummy1 = (teams)e.get(j+1);
            double y = dummy1.getWinPercentage() * dummy.getStrengthOfSchedule();
            double a = (dummy1.getPpt() + dummy1.getDpt()) / 200;
            x/=a;
            if (x>y){
                e.remove(j+1);
            }else{
                e.remove(j);
            }
        }
        return e;
    }
    public static void printRound(ArrayList a,ArrayList b,ArrayList c,ArrayList d, int x){
        System.out.println("Round of " + x);
        for (int i = 0; i<a.size(); i++){
            System.out.println(((teams)a.get(i)).getName());
        }
        for (int i = 0; i<b.size(); i++){
            System.out.println(((teams)b.get(i)).getName());
        }
        for (int i = 0; i<c.size(); i++){
            System.out.println(((teams)c.get(i)).getName());
        }
        for (int i = 0; i<d.size(); i++){
            System.out.println(((teams)d.get(i)).getName());
        }
    }
    public static void printFinalFour(ArrayList last, int x){
        System.out.println("Round of " + x);
        for (int i = 0; i<last.size(); i++){
            System.out.println(((teams)(last.get(i))).getName());
        }
    }
}
