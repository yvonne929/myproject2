package com.yvonne.s0318;

public class Customer {
    String number;
    int prices;
    float off = 0.1f;
    //屬性

    public Customer(String number,int prices) {
        this.number = number;
        this.prices = prices;
    }

    public void print(){
        float offMoney = (prices/1000)*off*1000;
        System.out.println(number + "\t" + prices + "\t" + (prices-offMoney));
    }
}


