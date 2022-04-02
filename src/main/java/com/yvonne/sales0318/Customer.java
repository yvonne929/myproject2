package com.yvonne.sales0318;

public class Customer {
    String number;
    int prices;
    float off = 0.1f;

    public Customer(String number,int prices) {
        this.number = number;
        this.prices = prices;
    }
    public float backMoney(){
        return (prices/1000)*off*1000;
    }

    public void print(){
        System.out.println(number + "\t" + prices + "\t" + (prices-backMoney()));
    }
}


