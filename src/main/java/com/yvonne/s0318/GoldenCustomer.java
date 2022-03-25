package com.yvonne.s0318;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String number, int prices){
    super(number,prices);
    off = 0.2f;
    //和SilverCustomer一樣會印出回饋金等
    }
}
