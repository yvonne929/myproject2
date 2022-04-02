package com.yvonne.buyTicket0325;

public class StudentTicket extends Ticket{
        float off;
    public StudentTicket(Station start, Station destination){
        super(start, destination);
        this.off = off;
        off = 0.9f;
    }

    public int prices(int p){
        price = (int)(price*off);
        return price;
    }
}
