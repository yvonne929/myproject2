package com.yvonne.buyTicket0325;

import com.yvonne.buyTicket0325.Station;
import com.yvonne.buyTicket0325.Ticket;

public class StudentTicket extends Ticket {
        float off = 0.9f;
    public StudentTicket(Station start, Station destination){
        super(start, destination);
        price = (int)(price*off);
    }
}
