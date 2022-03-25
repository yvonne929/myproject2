package com.yvonne.s0311;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"yvonne","emily","mary","kris"};
        int[] english = {80,70,60,50};
        int[] math = {76,87,69,90};
        for (int i = 0; i < 4; i++) {
            if (i!=3){
                System.out.println(names[i]+"\t"+english[i]+"\t"+math[i]+"\t"+(english[i]+math[i])/2);
            }
        }
    }
}
