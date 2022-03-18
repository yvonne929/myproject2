package com.yvonne;

public class GoldenCustomer extends SilverCustomer{
    public GoldenCustomer(String number, int prices){
    super(number,prices);
    off = 0.2f;
    }
}
