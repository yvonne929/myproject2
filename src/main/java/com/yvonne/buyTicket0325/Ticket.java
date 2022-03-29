package com.yvonne.buyTicket0325;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;
    //public -> 別的class也可以用
    //static -> 在多個地方保持只有一份資料
    //final -> 常數(固定數字)

    int start;
    int destination;
    int price;

    public Ticket(int start, int destination){
        this.start = start;
        this.destination = destination;
    }
}
