package com.yvonne;

public class Customer {
    String number;
    int prices;
    float off = 0.1f;

    public Customer(String number,int prices) {
        this.number = number;
        this.prices = prices;
    }

    public void print(){
        float offMoney = (prices/1000)*100;
        System.out.println(number + "\t" + prices + "\t" + (prices-offMoney));
    }
}


