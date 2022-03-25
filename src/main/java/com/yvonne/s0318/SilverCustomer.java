package com.yvonne.s0318;

import com.yvonne.s0318.Customer;

public class SilverCustomer extends Customer {
        int bonus;
    public SilverCustomer(String number,int prices){
        super(number,prices);
        this.bonus = bonus;
    }

    @Override
    public void print(){
        float offMoney = (prices/1000)*off*1000;
        float bonus = (prices/1000)*off*1000;
        System.out.println(number + "\t" + prices + "\t" + (prices-offMoney)+ "\t" +bonus);
    }
}

