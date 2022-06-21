package com.yvonne.buyTicket0325;

public class RoundTicket extends StudentTicket {
    public RoundTicket(Station start, Station destination){
        super(start, destination);
        off = 0.9f;
        price = (int)(price*2*off);
    }
}
