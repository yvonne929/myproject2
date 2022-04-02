package com.yvonne.buyTicket0325;

public class SeniorTicket extends StudentTicket{
    public SeniorTicket(Station start , Station destination){
        super(start, destination);
        off = 0.5f;
        price = (int)(price*off);
    }
}
