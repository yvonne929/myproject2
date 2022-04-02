package com.yvonne.buyTicket0325;

public class StudentTicket extends Ticket{
        float off = 0.9f;
    public StudentTicket(Station start, Station destination){
        super(start, destination);
        price = (int)(price*off);
    }
}
